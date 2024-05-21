package cache.src.com.cache;

public interface EvictionPolicy<K,V>{
    public void keyAccessed(K key);
    public  K evictKey();
    public V get(K key);
    public void put(K key, V value);
}