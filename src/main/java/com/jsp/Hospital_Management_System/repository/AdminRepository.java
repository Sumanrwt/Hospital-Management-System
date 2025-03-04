package com.jsp.Hospital_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jsp.Hospital_Management_System.Entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	@Query(value="select a from Admin a where a.email =:email and a.password=:pswd")
	Admin findByEmail(@Param("email") String email, @Param("pswd") String password);

}
