package com.example.twitterserver.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserDao {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/users")
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/api/users/{userId}")
    public User findUserById(
            @PathVariable("userId") Integer userId) {
        return userRepository.findById(userId).get();
    }
    // probably want to change to send over a request body
    //and then appened all those based on body
    //have almost all fields required for register, otherwise no need for func
    @PostMapping("/api/user/create/{userName}")
    public void createUser(
            @PathVariable("userName") String userName) {
        {
            User newRecord = new User();
            userRepository.save(newRecord);
        }
    }


}