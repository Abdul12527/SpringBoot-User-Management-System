package com.example.Usermanagementapp.Services;

import com.example.Usermanagementapp.Entities.User;

import com.example.Usermanagementapp.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class UserServices {
    @Autowired
    IUserRepo userRepo;

    public boolean addUser( User user){
        if(userRepo.existsById(user.getUserId()))
            return false;
        userRepo.save(user);
        return true;
    }

    public User getUser(Integer userId) throws Exception {
        return userRepo.findById(userId).orElse(null);
    }

    public List<User> getAllUsers(){
        return (List<User>) userRepo.findAll();
    }
    private static void updateIfNotNullAndNotEmpty(String value, Consumer<String> updater) {
        if (value != null && !value.isEmpty()) {
            updater.accept(value);
        }
    }

    public boolean updateUserInfo(Integer userId,String name,String userName,String address,String phoneNumber){
        if(!userRepo.existsById(userId))return false;
        User user=userRepo.findById(userId).get();
        updateIfNotNullAndNotEmpty(name, value -> user.setName(name));
        updateIfNotNullAndNotEmpty(userName, value -> user.setUserName(userName));
        updateIfNotNullAndNotEmpty(address, value -> user.setAddress(address));
        updateIfNotNullAndNotEmpty(phoneNumber, value -> user.setPhoneNumber(phoneNumber));
        userRepo.save(user);
        return true;
    }

    public boolean deleteUser(Integer userId){
        if(!userRepo.existsById(userId))return false;
        userRepo.deleteById(userId);
        return true;
    }

}
