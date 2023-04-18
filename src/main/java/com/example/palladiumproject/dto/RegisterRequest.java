package com.example.palladiumproject.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    private String userName;
    private String fullName;
    private String emailAddress;
    private String phoneNumber;
}
