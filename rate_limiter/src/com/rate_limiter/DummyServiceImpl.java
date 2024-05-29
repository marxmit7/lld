package rate_limiter.src.com.rate_limiter;

public class DummyServiceImpl implements DummyService{

    @AnnotatedRateLimit(maxRequests = 10, timeWindowMillis = 1000)
    @Override
    public void rateLimitedMethod(String clientId){
    }
}