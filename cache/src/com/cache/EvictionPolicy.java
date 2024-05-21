package cache.src.com.cache;

public interface EvictionPolicy<K>{
    public void keyAccessed(K key);
   public  K evictKey();
}