package com.example.Usermanagementapp.Services;

import com.example.Usermanagementapp.Entities.User;
import com.example.Usermanagementapp.Repository.SavingAndRetrieving;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServices {
    @Autowired
    SavingAndRetrieving dbop1;

    public boolean addUser(@Valid User user){
        if(dbop1.checkUserId(user.getUserId()))
            return false;
        dbop1.addUser(user);
        return true;
    }

    public User getUser(Integer userId) throws Exception {
        if(!dbop1.checkUserId(userId))throw new Exception("user not found");
        return dbop1.getUser(userId);
    }

    public List<User> getAllUsers(){
        return new ArrayList<User>(dbop1.getAllUsers().values());
    }

    public boolean updateUserInfo(Integer userId,String name,String userName,String address,String phoneNumber){
        if(!dbop1.checkUserId(userId))return false;
        if(name!=null&&name.length()>0)dbop1.updateName(userId,name);
        if(userName!=null&&userName.length()>0)dbop1.updateUserName(userId,userName);
        if(address!=null&&address.length()>0)dbop1.updateUserAddress(userId,address);
        if(phoneNumber!=null&&phoneNumber.length()>0)dbop1.updateUserPhoneNumber(userId,phoneNumber);
        return true;
    }

    public boolean deleteUser(Integer userId){
        if(!dbop1.checkUserId(userId))return false;
        dbop1.deleteUser(userId);
        return true;
    }

}
