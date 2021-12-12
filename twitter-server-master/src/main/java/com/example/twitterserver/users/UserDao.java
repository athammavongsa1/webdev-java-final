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
    //order goes register => login => loggedIn

    //registers a user into the database
    @PostMapping("/api/register")
    public User register(@RequestBody User user, HttpSession session){
        session.setAttribute("currentUser", user);
        userRepository.save(user);
        return user;
    }
    //gets?? who logs in (why is not a get endpoint --- can only think of this for security purposes)
    @PostMapping("/api/loggedin")
    public User loggedIn(HttpSession session){
       return  (User) session.getAttribute("currentUser");
    }
    //need to change this logic that it asks for a match on the userId? idk how
    @PostMapping("api/login")
    public User login(@RequestBody User loginUser, HttpSession session)
    {
        for(User user: userRepository.findAll()){
            if(user.getUser_name().equals(loginUser.getUser_name())){
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