package com.example.Usermanagementapp.Repository;

import com.example.Usermanagementapp.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SavingAndRetrieving {

    @Autowired
    HashMap<Integer,User> userDb;

    public boolean checkUserId(Integer userId){
        return userDb.containsKey(userId);
    }

    public void addUser(User user){
        userDb.put(user.getUserId(),user);
    }

    public HashMap<Integer,User> getAllUsers(){
        return userDb;
    }

    public User getUser(Integer userId){
        return userDb.get(userId);
    }

    public void updateName(Integer userId,String name){
        userDb.get(userId).setName(name);
    }
    public void updateUserName(Integer userId,String userName){
        userDb.get(userId).setUserName(userName);
    }
    public void  updateUserAddress(Integer userId,String address){
        userDb.get(userId).setAddress(address);
    }
    public void updateUserPhoneNumber(Integer userId,String phoneNumber){
        userDb.get(userId).setPhoneNumber(phoneNumber);
    }
    public void deleteUser(Integer userId){
        userDb.remove(userId);
    }

}
