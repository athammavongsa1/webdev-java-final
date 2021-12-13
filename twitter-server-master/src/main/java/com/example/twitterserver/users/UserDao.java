package com.example.twitterserver.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class UserDao {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/api/users")
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    //need to change this fetch
    @GetMapping("/api/users/{userId}")
    public User findUserById(
            @PathVariable("userId") Integer userId) {
        return userRepository.findById(userId).get();
    }

    @PostMapping("/api/register")
    public User register(@RequestBody User user, HttpSession session){

        session.setAttribute("currentUser", user);

        userRepository.save(user);
        return user;
    }


    @PostMapping("/api/loggedin")
    public User loggedIn(HttpSession session){
       return  (User) session.getAttribute("currentUser");
    }

    @PostMapping("/api/login")
    public User login(@RequestBody User loginUser, HttpSession session)
    {
        for(User user: userRepository.findAll()){
            if(user.getUsername().equals(loginUser.getUsername())){
                session.setAttribute("currentUser", user);
                return user;
            }
        }
        return null;

    }

    @PostMapping("api/logout")
    public void logout( HttpSession session)
    {
        session.invalidate();

    }





}