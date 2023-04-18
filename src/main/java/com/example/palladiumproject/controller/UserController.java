package com.example.palladiumproject.controller;

import com.example.palladiumproject.dto.RegisterRequest;
import com.example.palladiumproject.entity.User;
import com.example.palladiumproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {
    private final UserService userService;
    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return userService.getUsers();
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest registerRequest) {
        return userService.registerUser(registerRequest);
    }

}
