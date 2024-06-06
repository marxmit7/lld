package cdn.src.com.cdn;

public class CDNManager{
    private static CDNManager instance;

    private CDNManager(){}

    public static CDNManager getInstance(){
        if(instance==null){
            synchronized(CDNManager.class){
                if(instance==null)
                    instance = new CDNManager();
            }
        }

        return instance;
    }
}