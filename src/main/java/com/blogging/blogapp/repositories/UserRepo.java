package com.blogging.blogapp.repositories;

import com.blogging.blogapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {


}
