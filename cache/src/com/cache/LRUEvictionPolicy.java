package cache.src.com.cache;


import java.util.HashMap;
import java.util.Map;
public class LRUEvictionPolicy<K,V> implements EvictionPolicy<K>{

    private Integer capacity;
    private Map<K, Node<K,V>> map;
    private Node<K,V> head;
    private Node<K,V> tail;

    public LRUEvictionPolicy(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node<>(null,null);
        tail = new Node<>(null,null);
        head.next = tail;
        tail.prev = head;
        
    }
    public Map<K, Node<K,V>> getCacheMap(){
        return map;
    }

    @Override
    public void keyAccessed(K key){

        Node<K,V> node= map.get(key);
        if(node!=null)
        {
            removeNode(map.get(key));
            addToHead(map.get(key));
        }
        
    }

    private void addToHead(Node<K,V> node){

        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
  
    }

    private void removeNode(Node<K,V> node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    @Override
    public K evictKey(){
        if(map.size()==0) return null;

        Node<K, V> nodeToEvict = tail.prev;
        removeNode(nodeToEvict);
        map.remove(nodeToEvict.key);
        return nodeToEvict.key;
    }

    public V get(K key){

        Node<K, V> node = map.get(key);

        if(node==null){
            return null;
        }
        keyAccessed(key);
        return node.value;

    }

    public void put(K key, V value){

        Node<K,V> node = map.get(key);

        if(node!=null){
            node.value = value;
            removeNode(node);
            addToHead(node);
        } else {

            if(map.size()>=capacity){
                K evictedKey = evictKey();
                map.remove(evictedKey);
            }

            Node<K, V> nodeToBeAdded = new Node<>(key,value);
            map.put(key,nodeToBeAdded);
            addToHead(nodeToBeAdded);
        }


    }
}