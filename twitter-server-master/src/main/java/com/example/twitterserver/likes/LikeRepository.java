package com.example.twitterserver.likes;

import org.springframework.data.repository.CrudRepository;

public interface LikeRepository
        extends CrudRepository<Like, Integer> {
}
