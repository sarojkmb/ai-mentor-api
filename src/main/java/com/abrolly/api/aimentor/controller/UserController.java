package com.abrolly.api.aimentor.controller;


import com.abrolly.api.aimentor.model.User;
import com.abrolly.api.aimentor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mentor")
public class UserController {

    @Autowired
    private UserService userService;

    // Get All Notes
    @GetMapping("/users")
    public List<User> getAllNotes() {
        return userService.getAllUserService();
    }

    // Create a new User
    @PostMapping("/user")
    public User createNote(@Valid @RequestBody User user) {
        return userService.createUserService(user);
    }

    // Get a Single User
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userService.getUserByIdService(userId);
    }

    // Update a User
    @PutMapping("/user/{id}")
    public User updateNote(@PathVariable(value = "id") Long userid,
                           @Valid @RequestBody User userDetails) {
        return userService.updateUserService(userDetails, userid);
    }

    // Delete a User
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
        userService.deleteUserService(userId);
        return ResponseEntity.ok().build();
    }
}
