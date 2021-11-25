package com.egg.start.security.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.egg.start.security.entity.RolUser;
import com.egg.start.security.entity.UserEntity;
import com.egg.start.security.repository.UserRepository;
import com.egg.start.security.service.UserService;

@Service
public class UserServiceImplement implements UserDetailsService, UserService {
	private UserRepository userRepo;

	@Autowired
	public UserServiceImplement(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepo.findByUsername(username);
		if (!Objects.isNull(user)) {
			// created list for save permise
			List<GrantedAuthority> authority = new ArrayList<>();
			// Created a list of permise
			GrantedAuthority authority1 = new SimpleGrantedAuthority("ROLE_" + user.getRol());
			// Save in the list a list permise
			authority.add(authority1);
			
			//	This save the object UserEntity, for may affter be used
			ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
			HttpSession session = attr.getRequest().getSession(true);
			session.setAttribute("userSession", user);

			User usser = new User(user.getUsername(), user.getPassword(), authority);
			return usser;

		} else {
			return null;
		}
	}

	@Override
	public UserEntity register(UserEntity user) throws Exception {
		try {
			user.setRol(RolUser.USUARIO);
			return user = userRepo.save(user);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
