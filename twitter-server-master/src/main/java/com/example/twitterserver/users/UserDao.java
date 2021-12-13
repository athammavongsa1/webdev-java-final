package com.example.twitterserver.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "https://localhost:3000") # not working
//@CrossOrigin(origins = "https://localhost:8080") # not working
//@CrossOrigin(origins = "*") # not working
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
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

    // You cannot send a req.body with a GET
    // You cannot send credentials using a GET
    // Effectively, we are forcing this POST mapping to be read-only
    @PostMapping("/api/loggedin")
    public User loggedIn(HttpSession session){
       return  (User) session.getAttribute("currentUser");
    }
    //need to change this logic that it asks for a match on the userId? idk how
    //do a find userUserByUserNameAndPassword
    //select
    @PostMapping("/api/login")
    public User login(@RequestBody User loginUser, HttpSession session)
    {
        //findUserByCredentials and pass the userName and password in the login user
//        User user = userRepository.findUserByCredentials(loginUser.getUser_name(), loginUser.getPassword);

//        System.out.println(loginUser.getUsername());

//        return loginUser;

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