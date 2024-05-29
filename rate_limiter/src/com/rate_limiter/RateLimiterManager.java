package rate_limiter.src.com.rate_limiter;

import java.util.Map;
import java.util.HashMap;

public class RateLimiterManager{
    private static RateLimiterManager instance ;
    private Map<String, RateLimiter> rateLimiterMap = new HashMap<>();

    private RateLimiterManager(){};

    public static synchronized RateLimiterManager getInstance(){
        if(instance==null) {
            instance = new RateLimiterManager();
        }
        return instance;
    }

    public RateLimiter createRateLimiter(String clientId,String type, int maxRequests, long timeWindowMillis){
       return this.rateLimiterMap.computeIfAbsent(clientId, id -> RateLimiterFactory.getRateLimiter(type, maxRequests, timeWindowMillis));
    }
}