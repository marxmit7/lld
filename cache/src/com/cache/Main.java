package cache.src.com.cache;

public class Main{
    public static void main(String[] args){
        int capacity = 10;
        LRUCache<String,String> cache = SingletonCache.getInstance(capacity);


        for(Integer i=0;i<2*capacity;i++){
            cache.put(i.toString(),(new Integer((i*i))).toString());
        }

        for(Integer i=0;i<2*capacity;i++){
            System.out.println("Getting from cache for key: "+i+"  value: "+cache.get(i.toString()));
        }

    }
}