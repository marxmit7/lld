package spotify.src.com.spotify;

import java.util.List;

public interface RecommendationStrategy{

    List<Song> recommand(User user);

}