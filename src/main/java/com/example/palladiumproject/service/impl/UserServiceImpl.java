package com.example.palladiumproject.service.impl;

import com.example.palladiumproject.dto.RegisterRequest;
import com.example.palladiumproject.entity.User;
import com.example.palladiumproject.fakeDb.UsersDB;
import com.example.palladiumproject.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(UsersDB.usersDB());
    }

    @Override
    public ResponseEntity<String> registerUser(RegisterRequest registerRequest) {
        UsersDB.users.add(new User(registerRequest.getUserName(),
                registerRequest.getFullName(),
                registerRequest.getEmailAddress(), registerRequest.getPhoneNumber()));
        return ResponseEntity.ok("User added");
    }
}
