package com.example.twitterserver.whoToFollow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WhoToFollowDao {
    @Autowired
    WhoToFollowRepository WhoToFollowRepository;

    @GetMapping("/api/who")
    public List<WhoToFollow> findAllWho() {
        return (List<WhoToFollow>) WhoToFollowRepository.findAll();
    }
}

