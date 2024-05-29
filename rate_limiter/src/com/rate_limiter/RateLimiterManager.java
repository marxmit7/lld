package rate_limiter.src.com.rate_limiter;

public class RateLimiterManager{
    private static RateLimiterManager instance ;
    private RateLimiter rateLimiter;

    private RateLimiterManager(){};

    public static synchronized RateLimiterManager getInstance(){
        if(instance==null) {
            instance = new RateLimiterManager();
        }
        return instance;
    }

    public void createRateLimiter(String type, int maxRequests, long timeWindowMillis){
        this.rateLimiter = RateLimiterFactory.getRateLimiter(type, maxRequests, timeWindowMillis);
    }

    public RateLimiter getRateLimiter(){
        return rateLimiter;
    }
}