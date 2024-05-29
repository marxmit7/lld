package rate_limiter.src.com.rate_limiter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.lang.reflect.Method;

public class RateLimiterProxy implements InvocationHandler{

    private Object target;
    private RateLimiterManager rateLimiterManager = RateLimiterManager.getInstance();

    private RateLimiterProxy(Object targetObject){
        this.target = targetObject;
    }

    public static Object getInstance(Object targetObject){
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), new RateLimiterProxy(targetObject));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        
        Method targetMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());
        AnnotatedRateLimit rateLimit = targetMethod.getAnnotation(AnnotatedRateLimit.class);

        if(rateLimit!=null){
            String clientId = getClientId(args);
            String rateLimitType = getRateLimitType(args);
            SimpleRateLimiter simpleRateLimiter = (SimpleRateLimiter)rateLimiterManager.createRateLimiter(clientId, rateLimitType, rateLimit.maxRequests(), rateLimit.timeWindowMillis());
            RateLimiterDecorator rateLimiterDecorator = new RateLimiterDecorator(simpleRateLimiter);
            rateLimiterDecorator.isAllowed(clientId);
        } else {
            System.out.println("ratelimit is null");
        }

        return method.invoke(target, args);
    }

    private String getClientId(Object[] args){
        return "test";
    }

    private String getRateLimitType(Object[] args){
        return "simple";
    }

}