package com.yourhr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yourhr.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
