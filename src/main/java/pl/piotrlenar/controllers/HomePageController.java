package pl.piotrlenar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.piotrlenar.entities.Tweet;
import pl.piotrlenar.entities.User;
import pl.piotrlenar.repositories.TweetRepository;
import pl.piotrlenar.repositories.UserRepository;

import java.util.List;

@Controller
public class HomePageController {

    private final UserRepository userRepository;
    private final TweetRepository tweetRepository;

    public HomePageController(TweetRepository tweetRepository, UserRepository userRepository) {
        this.tweetRepository = tweetRepository;
        this.userRepository = userRepository;
    }

    @ModelAttribute("users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @ModelAttribute("tweets")
    public List<Tweet> getAllTweets(){
        return tweetRepository.findAll();
    }

    @ModelAttribute("tweet")
    public Tweet createTweet(){
        return new Tweet();
    }

    @RequestMapping("/home")
    public String getHome(){
        return "index";
    }

    //@PostMapping("/") //TODO: Jak zrealizować przesyłanie formularza ze strony głównej??
}
