import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class RecommendationEngineTest {
    private RecommendationEngine engine;

    @Before
    public void setUp() {
        engine = new RecommendationEngine();
    }

    @Test
    public void testNoWatchHistory() {
        User user = new User("user_none", new ArrayList<>());
        List<Movie> recommendations = engine.getRecommendations(user);
        assertNotNull(recommendations);
        // Should return popular/default movies if history is empty
        assertTrue("Should return at least 5 default movies", recommendations.size() >= 5);
    }

    @Test
    public void testOneWatchedMovie() {
        List<Movie> history = new ArrayList<>();
        history.add(new Movie("Inception", "Sci-Fi", 9.0));
        User user = new User("user_one", history);
        List<Movie> recommendations = engine.getRecommendations(user);
        assertTrue(recommendations.size() >= 5);
    }

    @Test
    public void testIdenticalRatingsAcrossGenres() {
        List<Movie> history = new ArrayList<>();
        history.add(new Movie("MovieA", "Action", 8.0));
        history.add(new Movie("MovieB", "Comedy", 8.0));
        User user = new User("user_equal", history);
        List<Movie> recommendations = engine.getRecommendations(user);
        assertNotNull(recommendations);
        assertTrue(recommendations.size() >= 5);
    }

    @Test
    public void testLargeWatchHistoryStress() {
        List<Movie> largeHistory = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            largeHistory.add(new Movie("Movie" + i, "Genre" + (i % 5), 7.0));
        }
        User user = new User("user_stress", largeHistory);
        long startTime = System.currentTimeMillis();
        List<Movie> recommendations = engine.getRecommendations(user);
        long endTime = System.currentTimeMillis();
        
        assertTrue("Should process large history quickly", (endTime - startTime) < 1000);
        assertTrue(recommendations.size() >= 5);
    }
}
