package com.example.tuiterserver.tweets;

import org.springframework.data.repository.CrudRepository;

public interface TweetRepository
    extends CrudRepository<Tweet, Integer> {
}
