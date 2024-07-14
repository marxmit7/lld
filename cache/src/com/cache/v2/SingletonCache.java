package cache.src.com.cache.v2;

public class SingletonCache{
    private static LRUCache<String, String> instance;

    private SingletonCache(){};

    public synchronized static LRUCache<String, String> getInstance(int capacity,CacheType cacheType){
        if(instance ==null){
            switch (cacheType) {
                case LRU:
                    instance = new LRUCache<>(capacity);
                    break;
                default:
                    instance = new LRUCache<>(capacity);
                    break;
            }
        }
        return instance;
    }
}