package rate_limiter.src.com.rate_limiter;

public interface RateLimiter{
    boolean isAllowed(String userId);
}