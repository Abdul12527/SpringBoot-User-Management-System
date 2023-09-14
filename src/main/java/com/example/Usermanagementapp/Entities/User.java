package com.example.Usermanagementapp.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Integer userId;
    private String name;
    private String userName;
    private String address;
    private String phoneNumber;
}
