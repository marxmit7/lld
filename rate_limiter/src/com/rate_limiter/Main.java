package rate_limiter.src.com.rate_limiter;

import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args){

        // testNormalRateLimiter();

        testAnnoatedRateLimiter();

    }

    private static void testAnnoatedRateLimiter(){

        DummyService dummyService  = (DummyService)RateLimiterProxy.getInstance(new DummyServiceImpl());

        for(int i=0;i<200;i++){
            dummyService.rateLimitedMethod(Integer.toString(i));
        }
        
    }

    private static void testNormalRateLimiter(){
        RateLimiterManager rateLimiterManager = RateLimiterManager.getInstance();

        String clientId = "c1";        
        RateLimiter decoratedRateLimiter = new RateLimiterDecorator(rateLimiterManager.createRateLimiter(clientId,"simple", 100, 6));

        for(int i=0;i<200;i++){
            decoratedRateLimiter.isAllowed(clientId);
        }

    }

 
}