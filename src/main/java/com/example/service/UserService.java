package com.example.service;

import com.example.model.User;

public interface UserService {
	public User findUserByPhone(String email);
	public void saveUser(User user);
}
