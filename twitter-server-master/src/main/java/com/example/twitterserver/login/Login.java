package com.example.twitterserver.login;

import com.example.twitterserver.users.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class Login {
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
    }






 }