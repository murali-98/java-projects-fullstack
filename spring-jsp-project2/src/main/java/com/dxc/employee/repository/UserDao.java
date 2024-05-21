package com.dxc.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dxc.employee.controller.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> 
{
	boolean existsByUsername(String username);
	boolean existsByPasswrd(String passwrd);
}
