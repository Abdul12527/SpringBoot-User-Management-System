package com.example.Usermanagementapp.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @NotNull
    @Id
    private Integer userId;
    @NotBlank
    private String name;
    private Date dateOfBirth;
    @NotBlank
    private String userName;
    private String address;
    @NotBlank
    @Pattern(regexp = "^(\\+\\d{1,3})?\\d{10}$")
    private String phoneNumber;
    private Date date;
    private Time time;
}
