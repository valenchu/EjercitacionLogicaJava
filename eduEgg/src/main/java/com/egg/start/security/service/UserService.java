package com.egg.start.security.service;

import com.egg.start.security.entity.UserEntity;

public interface UserService {
	
	public UserEntity register(UserEntity user)throws Exception;

}
