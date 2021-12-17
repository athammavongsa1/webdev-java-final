package com.example.twitterserver.users;

import com.example.twitterserver.likes.Like;
import com.example.twitterserver.tweets.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController

//@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true", allowedHeaders ="*", methods={RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT,RequestMethod.GET } )

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
    @PutMapping("/api/updateUserProfile")

    public void updateUserProfile(
            @RequestBody User newRecord
    ) {
        User oldRecord = userRepository.findById(newRecord.getUserId()).get();
        oldRecord.setFirstName(newRecord.getFirstName());
        oldRecord.setLastName(newRecord.getLastName());
        oldRecord.setLocation(newRecord.getLocation());
        oldRecord.setWebsite(newRecord.getWebsite());
        oldRecord.setBio(newRecord.getBio());
        oldRecord.setProfilePicture(newRecord.getProfilePicture());

        userRepository.save(oldRecord);
    }

    @GetMapping("/api/user/getLikes/{userId}")
    public List<Like> findTweetById(
            @PathVariable("userId") Integer userId) {
        return userRepository.findById(userId).get().getLikes();
    }


    //all apis related to login below

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
        System.out.println("logged in user : " + loginUser.getUsername());
        System.out.println("logged in user PW : " + loginUser.getPassword());

        for(User user: userRepository.findAll()){
            if(user.getUsername().equals(loginUser.getUsername()) && (user.getPassword().equals(loginUser.getPassword()) ) ) {
                session.setAttribute("currentUser", user);
                return user;
            }
        }
        System.out.println("from userDAO.js, NO MATCH");
        return null;

    }

    @PostMapping("/api/logout")
    public void logout(HttpSession session)
    {
        session.invalidate();

    }








}