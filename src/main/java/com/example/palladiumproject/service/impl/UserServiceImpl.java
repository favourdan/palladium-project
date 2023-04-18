package com.example.palladiumproject.service.impl;

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
}
