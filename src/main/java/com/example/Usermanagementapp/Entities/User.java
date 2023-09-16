package com.example.Usermanagementapp.Entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    @NotNull
    private Integer userId;
    @NotBlank
    private String name;
    @NotBlank
    private String userName;
    private String address;
    private String phoneNumber;
}
