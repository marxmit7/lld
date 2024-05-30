package spotify.src.com.spotify;

import java.util.List;
import java.util.ArrayList;

public class MusicLibrary{
    private List<Song> songs;

    public MusicLibrary(){
        this.songs = new ArrayList<>();
    }

    public List<Song> search(String query){
        return songs;
    }

    public void addSong(Song song){
        this.songs.add(song);
    }

    public void addSong(List<Song> song){
        this.songs.addAll(song);
    }

    public List<Song> getSongs(){
        return this.songs;
    }
    
    

}