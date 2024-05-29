package rate_limiter.src.com.rate_limiter;

import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args){

        RateLimiterManager rateLimiterManager = RateLimiterManager.getInstance();
        rateLimiterManager.createRateLimiter("simple", 100, 6);
        RateLimiter decoratedRateLimiter = new RateLimiterDecorator(rateLimiterManager.getRateLimiter());


        String clientId = "c1";

        for(int i=0;i<200;i++){
            decoratedRateLimiter.isAllowed(clientId);
        }
    }
}