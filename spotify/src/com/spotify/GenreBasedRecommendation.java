package spotify.src.com.spotify;

import java.util.List;
import java.util.ArrayList;

public class GenreBasedRecommendation implements RecommendationStrategy{

    @Override
    public List<Song> recommand(User user){
        return new ArrayList<>();
    }
}