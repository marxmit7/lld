package cache.src.com.cache;

public class LRUCache<K,V> implements Cache<K,V>{

    private EvictionPolicy<K> lruEvictionPolicy;

    public LRUCache(int capacity){
        this.lruEvictionPolicy = new LRUEvictionPolicy<>(capacity);

    }

    @Override
        public V get(K key){
            return ((LRUEvictionPolicy<K,V>)lruEvictionPolicy).get(key);
        }

    @Override
    public void put(K key, V value){
        ((LRUEvictionPolicy<K,V>)lruEvictionPolicy).put(key,value);
    }
}