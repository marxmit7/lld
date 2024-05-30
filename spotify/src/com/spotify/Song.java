package spotify.src.com.spotify;

public class Song {
    private String id;
    private String title;
    private String artist;
    private String album;
    private String releaseDate;
    private int duration ;

    public Song(String id, String title, String artist, String album){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String getTitle(){
        return this.title;
    }

}