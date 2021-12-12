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

    //login
    @PostMapping("/api/register")
    public User register(@RequestBody User user, HttpSession session){
        session.setAttribute("currentUser", user);
        return user;
    }

    @PostMapping("/api/loggedin")
    public User loggedIn(HttpSession session){
       return  (User) session.getAttribute("currentUser");
    }




}