package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
