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

    @PostMapping("/api/user/create/{userName}")
    public void createRecord(
            @PathVariable("userName") String userName) {
        {
            User newRecord = new User();
            String user = userName + "123";
            newRecord.setUsername(user);
            newRecord.setFirstName(userName);
            newRecord.setLastName("");
            newRecord.setEmail(userName + "@gmail.com");
            newRecord.setPassword("");
            newRecord.setVerified(true);
            userRepository.save(newRecord);
        }
    }

    @PostMapping("/api/user/login/set")
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