package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> userList = List.of(
			new User(1521L, "Sanjit Murmu", "8845774"),
			new User(1524L, "Arka Chakraborty", "5574581"),
			new User(1529L, "Gaurav Trivaedi", "6695474")
			);

	@Override
	public User getUser(Long id) {
		
		return userList.stream().filter(user-> user.getId().equals(id)).findAny().orElse(null);
	}

}
