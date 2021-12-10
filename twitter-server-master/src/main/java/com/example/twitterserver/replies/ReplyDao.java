package com.example.twitterserver.replies;

import com.example.twitterserver.tweets.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ReplyDao {
    @Autowired
    TweetRepository tweetRepository;
    @GetMapping("/api/tweets/{tweetId}/replies")
    public List<Reply> findRepliesForTweet(
            @PathVariable("tweetId") Integer tweetId) {
        return tweetRepository.findById(tweetId).get().getReplies();
    }
}
