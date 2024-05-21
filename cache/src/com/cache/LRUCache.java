package cache.src.com.cache;

public class LRUCache<K,V> implements Cache<K,V>{

    private EvictionPolicy<K, V> lruEvictionPolicy;

    public LRUCache(int capacity){
        this.lruEvictionPolicy = new LRUEvictionPolicy<>(capacity);

    }

    @Override
        public V get(K key){
            return lruEvictionPolicy.get(key);
        }

    @Override
    public void put(K key, V value){
        lruEvictionPolicy.put(key,value);
    }
}