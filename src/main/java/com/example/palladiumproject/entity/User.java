package com.example.palladiumproject.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String userName;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
}
