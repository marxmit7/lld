package cache.src.com.cache.v2;

public interface EvictionPolicy<K,V>{
    public void keyAccessed(K key);
    public V get(K key);
    public K evictLastNode();
    public void put(K key, V val);
}