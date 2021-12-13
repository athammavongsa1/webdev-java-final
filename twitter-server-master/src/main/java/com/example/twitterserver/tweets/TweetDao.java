package com.example.twitterserver.tweets;

import com.example.twitterserver.users.User;
import com.example.twitterserver.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TweetDao {
    @Autowired
    UserRepository userRepository;
    @Autowired
    TweetRepository tweetRepository;
    @GetMapping("/api/tweets/{tweetId}")
    public Tweet findTweetById(
            @PathVariable("tweetId") Integer tweetId) {
        return tweetRepository.findById(tweetId).get();
    }
    @GetMapping("/api/tweets")
    public List<Tweet> findAllTweets()
        {
        return (List<Tweet>) tweetRepository.findAll();
        }

    //probably could have just used this api but again has security problems
    @GetMapping("/api/users/{userId}/tweets")
    public List<Tweet> findTweetsByUser(
            @PathVariable("userId") Integer userId) {
        return userRepository.findById(userId).get()
                .getTweets();
    }



}

/*
http://localhost:8080/api/users/1/tweets
[
  {
    "tweetId": 1,
    "tweet": "Alice 1st Tweet",
    "tweetedOn": "2021-11-28T13:01:30.000+00:00"
  },
  {
    "tweetId": 3,
    "tweet": "Alice 2nd Tweet",
    "tweetedOn": "2021-11-28T13:01:30.000+00:00"
  }
]
 */

/*
http://localhost:8080/api/users/2/tweets
[
  {
    "tweetId": 2,
    "tweet": "Bob 1st Tweet",
    "tweetedOn": "2021-11-28T13:01:30.000+00:00"
  }
]
 */

/*
http://localhost:8080/api/users/3/tweets
[
  {
    "tweetId": 4,
    "tweet": "Charlie 1st Tweet",
    "tweetedOn": "2021-11-28T13:01:30.000+00:00"
  },
  {
    "tweetId": 5,
    "tweet": "Charlie 2nd Tweet",
    "tweetedOn": "2021-11-28T13:01:30.000+00:00"
  },
  {
    "tweetId": 6,
    "tweet": "Charlie 3rd Tweet",
    "tweetedOn": "2021-11-28T13:01:30.000+00:00"
  }
]
 */