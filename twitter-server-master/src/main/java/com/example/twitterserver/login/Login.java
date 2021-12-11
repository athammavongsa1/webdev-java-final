package com.example.twitterserver.login;

import com.example.twitterserver.users.User;
import com.example.twitterserver.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@RestController
public class Login {
    @Autowired
    UserRepository userRepository;

    //setting session
    @GetMapping("/api/session/set/{attr}/{value}")
    public String setSessionAttribute(
            @PathVariable("attr") String attr, @PathVariable("value") String value, HttpSession session) {
        session.setAttribute(attr, value);
        return attr + " = " + value;
    }
    //getting session
    @GetMapping("/api/session/get/{attr}")
    public String getSessionAttribute(
            @PathVariable ("attr") String attr,
            HttpSession session) {
        return (String)session.getAttribute(attr);
    }
    //invalidate session
    @GetMapping("/api/session/invalidate")
    public String invalidateSession(
            HttpSession session) {
        session.invalidate();
        return "session invalidated";
    }    @PostMapping("/api/user/login/set")
    public User login( @RequestBody User user,
                       HttpSession session) {
        session.setAttribute("currentUser", user);
        return user;
    }
    @GetMapping("/api/user/login/get")
    public Optional<User> getLoggedInUser(HttpSession session) {
        User currentUser = (User)
                session.getAttribute("currentUser");

        Optional<User> userFromDb = userRepository.findById(currentUser.getUserId());

        return userFromDb;
    }

    @PostMapping("/api/user/logout")
    public void logout
            (HttpSession session) {
        session.invalidate();
    }




}