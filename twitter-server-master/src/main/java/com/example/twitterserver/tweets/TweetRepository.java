package com.example.twitterserver.tweets;

import org.springframework.data.repository.CrudRepository;

public interface TweetRepository
    extends CrudRepository<Tweet, Integer> {
}
