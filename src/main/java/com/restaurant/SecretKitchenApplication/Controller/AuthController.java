package com.restaurant.SecretKitchenApplication.Controller;

import com.restaurant.SecretKitchenApplication.Entity.Users;
import com.restaurant.SecretKitchenApplication.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    // ✅ User Signup
    @PostMapping("/signup")
    public String signup(@RequestBody Users user) {
        if (user.getEmail() == null || user.getPassword() == null) {
            return "Email and password are required!";
        }
        if (userService.existsByEmail(user.getEmail())) {
            return "Email already registered!";
        }
        user.setRole("CUSTOMER"); // default role
        userService.registerUser(user);
        return "Signup successful! Please login.";
    }

    // ✅ User Login
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        if (email == null || password == null) {
            return "Email and password are required!";
        }
        Users loggedInUser = userService.loginUser(email, password);
        if (loggedInUser != null) {
            return "Login successful! Welcome " + loggedInUser.getName();
        }
        return "Invalid email or password!";
    }
}
