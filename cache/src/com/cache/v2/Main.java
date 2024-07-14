package cache.src.com.cache.v2;

public class Main {
    public static void main(String[] args){

        int capacity = 15;

        LRUCache<String, String> lruCache = SingletonCache.getInstance(capacity, CacheType.LRU);

        for(Integer i=0;i<2*capacity;i++){
            lruCache.put(i.toString(),((Integer)(i*i)).toString());
        }

        for(Integer i=0;i<2*capacity;i++){
            System.out.println("Getting from cache for key: "+i+"  value: "+lruCache.get(i.toString()));
        }

    }
}