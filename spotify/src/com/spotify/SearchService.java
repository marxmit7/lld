package spotify.src.com.spotify;

import java.util.List;

public class SearchService{
    private MusicLibrary musicLibrary;

    public SearchService(MusicLibrary musicLibrary){
        this.musicLibrary = musicLibrary;
    }

    public List<Song> search(String query){
        return this.musicLibrary.search(query);
    }
}