package spotify.src.com.spotify;

public class StreamingService{
    private  static StreamingService instance;

    private StreamingService(){}

    public static synchronized StreamingService getInstance(){
        if(instance==null){
            instance = new StreamingService();
        }
        return instance;
    }

    public void streamSong(Song song){
        System.out.println("streaming... "+song.getTitle());
    }
}