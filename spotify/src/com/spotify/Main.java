package spotify.src.com.spotify;

import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws Exception{
        UserManager userManager = UserManager.getInstance();
        PlayListManager playListManager = PlayListManager.getInstance(userManager);

        MusicLibrary musicLibrary = new MusicLibrary();
        SearchService searchService = new SearchService(musicLibrary);
        RecommendationService recommendationService = new RecommendationService();

        User amit = new User("marxmit7", "amit", "kumar", "amit@spotify.com", "70047", "123");
        userManager.registerUser(amit);
        playListManager.cratePlayList("rock", amit.getUserId());
        playListManager.cratePlayList("pop", amit.getUserId());
        playListManager.cratePlayList("bolly", amit.getUserId());

        User yash = new User("ycv005", "yash", "verma", "yash@spotify.com", "700471", "1234");
        userManager.registerUser(yash);

        playListManager.cratePlayList("deshi", yash.getUserId());
        playListManager.cratePlayList("bhojpuria", yash.getUserId());
        playListManager.cratePlayList("tolly", yash.getUserId());

        Song song1 = new Song("song1", "maps", "maroon5", "null");
        Song song2 = new Song("song2", "shape of you", "ed sheeren", "null");
        Song song3 = new Song("song3", "piya re", "yash", "null");
        Song song4 = new Song("song4", "tu jaye", "yash", "null");
        Song song5 = new Song("song5", "lollipop", "yash", "null");

        musicLibrary.addSong(Arrays.asList(song1,song2,song3,song4,song5));

        playListManager.getPlayList(amit.getUserId(), "rock").addMultipleSongs(Arrays.asList(song1,song2,song3));

        playListManager.getAllPlayListMap(amit.getUserId()).forEach((key,value)->{
            System.out.println("playlist name: "+key);
            value.getSongs().forEach(name ->{
                System.out.println("\tsong in this playlist: "+name.getTitle());
            });
        });

    }
}