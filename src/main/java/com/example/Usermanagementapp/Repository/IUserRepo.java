package com.example.Usermanagementapp.Repository;

import com.example.Usermanagementapp.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {
}
