package rate_limiter.src.com.rate_limiter;

public class RateLimiterDecorator implements RateLimiter{
    private RateLimiter rateLimiter;

    public RateLimiterDecorator(RateLimiter rateLimiter){
        this.rateLimiter = rateLimiter;
    }

    @Override
    public boolean isAllowed(String clientId){
        boolean isAllowed =  rateLimiter.isAllowed(clientId);
        System.out.println("Reuqest from client id: "+clientId+" is "+(isAllowed?"":"not")+" allowed");
        return isAllowed;
    }
}