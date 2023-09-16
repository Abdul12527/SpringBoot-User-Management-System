package com.example.Usermanagementapp.Controller;

import com.example.Usermanagementapp.Entities.User;
import com.example.Usermanagementapp.Services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    UserServices us;

    @PostMapping("/userMan/user")
    public String addUser(@RequestBody @Valid User user){
        if(us.addUser(user))return "200 added user successfully";
        return "500 user already exists";
    }

    @GetMapping("/userMan/user/{userId}")
    public User getUser(@PathVariable  Integer userId){
        try {
            return us.getUser(userId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @GetMapping("/userMan/allUsers")
    public List<User> getAll(){
        return us.getAllUsers();
    }

    @PutMapping("/userMan/userInfo")
    public String updateUserInfo(@RequestParam Integer userId,@RequestParam(required = false) String name,@RequestParam(required = false) String userName,@RequestParam(required = false) String address,@RequestParam(required = false) String phoneNumber){
        if(us.updateUserInfo(userId,name,userName,address,phoneNumber))return "200 updated the info";
        return "500 invalid user id";
    }

    @DeleteMapping("/userMan/user/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        if(us.deleteUser(userId))return "200 deleted the record for "+userId;
        return "500 Invalid user";
    }




}
