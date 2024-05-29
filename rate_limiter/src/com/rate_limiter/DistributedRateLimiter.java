package rate_limiter.src.com.rate_limiter;

public class DistributedRateLimiter implements RateLimiter{

    @Override 
    public boolean isAllowed(String clientId){
        return true;
    }
}