package com.java.medrecord.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.medrecord.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
