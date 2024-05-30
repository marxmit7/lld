package spotify.src.com.spotify;

import java.util.List;

public class RecommendationService {
    private RecommendationStrategy recommendationStrategy;

    public RecommendationService(RecommendationStrategy recommendationStrategy){
        this.recommendationStrategy = recommendationStrategy;
    }

    public RecommendationService(){
        this.recommendationStrategy = new GenreBasedRecommendation();
    }

    public List<Song> recommendSongs(User user){

        return recommendationStrategy.recommand(user);

    }
}