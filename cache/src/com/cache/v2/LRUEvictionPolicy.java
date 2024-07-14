package cache.src.com.cache.v2;

import java.util.*;

public class LRUEvictionPolicy<K,V> implements EvictionPolicy<K,V>{

    private Integer capacity;
    private Map<K, Node<K,V>> mp;
    private Node<K,V> head;
    private Node<K,V> tail;

    public LRUEvictionPolicy(int capacity){
        this.capacity = capacity;
        this.mp = new HashMap<>();
        this.head = new Node<>(null,null);
        this.tail = new Node<>(null,null);
        head.next = tail;
        tail.prev = head;
    }

    @Override
    public void keyAccessed(K key){
        Node<K,V> node = mp.get(key);
        if(node!=null){
            removeNode(node);
            addToHead(node);
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
    public V get(K key){

        Node<K,V> node = mp.get(key);
        if(node!=null){
            keyAccessed(key);
            return node.val;
        } else {
            return null;
        }

    }

    @Override
    public K evictLastNode(){
        if(mp.size()==0) return null;
        Node<K,V> nodeToEvict = tail.prev;
        removeNode(nodeToEvict);
        mp.remove(nodeToEvict.key);
        return nodeToEvict.key;

    }
    @Override
    public void put(K key, V val){
        
        Node<K,V> node = mp.get(key);
        if(node==null){

            if(mp.size()==capacity){
                K evictedKey = evictLastNode();
                mp.remove(evictedKey);
            }

            Node<K,V> newNode = new Node<>(key,val);
            mp.put(key,newNode);
            addToHead(newNode);
        } else {
            node.val = val;
            removeNode(node);
            addToHead(node);
        }

    }
}