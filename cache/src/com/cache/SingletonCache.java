package cache.src.com.cache;

public class SingletonCache{
    private static LRUCache<String , String> instance;
    private SingletonCache(){};

    public static synchronized LRUCache<String, String> getInstance(int capacity){
        if(instance==null) instance = new LRUCache<>(capacity);
    
        return instance;
    }
}