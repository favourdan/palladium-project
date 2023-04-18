package com.example.palladiumproject.service;

import com.example.palladiumproject.dto.RegisterRequest;
import com.example.palladiumproject.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<User>> getUsers();
    ResponseEntity<String> registerUser(RegisterRequest registerRequest);
}
