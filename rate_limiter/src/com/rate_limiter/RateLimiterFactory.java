package rate_limiter.src.com.rate_limiter;

public class RateLimiterFactory{

    public static RateLimiter getRateLimiter(String rateLimiterType, int maxRequests, long timeWindowMillis){
        switch(rateLimiterType){
            case "simple":
                return new SimpleRateLimiter(maxRequests, timeWindowMillis);
            case "distributed":
                return new DistributedRateLimiter();
            default:
            return new SimpleRateLimiter(maxRequests, timeWindowMillis);
        }
    }
}