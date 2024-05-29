package rate_limiter.src.com.rate_limiter;

public class RequestInfo {
    private Integer count;
    private long timestamp;

    public RequestInfo(Integer count, long time) {
        this.count = count;
        this.timestamp = time;
    }

    public Integer getCount(){
        return count;
    }

    public long getTimeStamp(){
        return timestamp;
    }

    public void setTimeStamp(long time){
        this.timestamp = time;
    }

    public void setCount(Integer count){
        this.count = count;
    }
}