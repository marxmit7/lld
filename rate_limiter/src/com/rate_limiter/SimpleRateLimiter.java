package rate_limiter.src.com.rate_limiter;

import java.util.concurrent.ConcurrentHashMap;

public class SimpleRateLimiter implements RateLimiter{

    private Integer maxRequests;
    private long timeWindowMillis;
    private ConcurrentHashMap<String, RequestInfo> clientRequestMap;

    public SimpleRateLimiter(int maxRequests, long timeWindowMillis){
        this.maxRequests = maxRequests;
        this.timeWindowMillis = timeWindowMillis;
        this.clientRequestMap = new ConcurrentHashMap();
    }

    @Override 
    public boolean isAllowed(String clientId){

        long currentTime = System.currentTimeMillis();

        clientRequestMap.compute(clientId, (key, requestInfo)->{
            if(requestInfo==null){
                return new RequestInfo(1, currentTime);
            }else if(currentTime - requestInfo.getTimeStamp() > timeWindowMillis){
                return new RequestInfo(1, currentTime);
            }else {
                requestInfo.setCount(requestInfo.getCount()+1);
                return requestInfo;
            }
        });

        return clientRequestMap.get(clientId).getCount()<=maxRequests;
    }
}