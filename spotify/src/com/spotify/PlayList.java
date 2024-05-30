package spotify.src.com.spotify;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class PlayList{
    private String id;
    private String name;
    private List<Song> songs;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;

    public PlayList(String id, String name, String userId){
        this.id = id;
        this.name = name;
        this.songs = new ArrayList<>();
        this.createdAt = new Date();
        this.updatedAt = new Date();
        this.createdBy = userId;
    }

    public String getName(){
        return this.name;
    }

    public void addSong(Song song){
        this.songs.add(song);
        this.updatedAt = new Date();
    }
    public void addMultipleSongs(List<Song> song){
        this.songs.addAll(song);
        this.updatedAt = new Date();
    }
    
    public void removeSong(Song song){
        this.songs.remove(song);
        this.updatedAt = new Date();
    }

    public  List<Song> getSongs(){
        return this.songs;
    }

}