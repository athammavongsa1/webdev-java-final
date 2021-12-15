package com.example.twitterserver.likes;

import com.example.twitterserver.tweets.Tweet;
import com.example.twitterserver.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true", allowedHeaders ="*", methods={RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT,RequestMethod.GET } )
public class LikeDao {
    @Autowired
    LikeRepository likeRepository;

    @GetMapping("/api/getAllLikes")
    public List<Like> getAllLikes() {
        return (List<Like>) likeRepository.findAll();
    }

    @RequestMapping(value="/api/likeTweet", method=RequestMethod.POST)
    public void createNewLike(@RequestBody Tweet tweetThatWasLiked) {
        Like newLike = new Like();
        newLike.setLikedBy(tweetThatWasLiked.getTweetedBy());
        newLike.setLiked(tweetThatWasLiked);
        likeRepository.save(newLike);
    }


    @RequestMapping(value="/api/unlikeTweet", method=RequestMethod.DELETE)
    public void deleteLike(@RequestBody Tweet tweetThatWasUnliked){
        for(Like like : likeRepository.findAll()){
            if(like.getLiked() == tweetThatWasUnliked && like.getLikedBy() == tweetThatWasUnliked.getTweetedBy()){
                Integer likeId = like.getLikeId();
                likeRepository.deleteById(likeId);
            }

        }

    }

}

