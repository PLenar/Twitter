package pl.piotrlenar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrlenar.entities.Tweet;
import pl.piotrlenar.entities.User;

import java.util.List;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

    List<Tweet> findTweetsByUser(User user);

    List<Tweet> findTweetsByUserId(Long user);
}
