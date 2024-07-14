package cache.src.com.cache.v2;

public interface Cache<K,V>{
    public V get(K key);
    public void put(K key,V val);
}