package com.egg.start.security.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.egg.start.security.entity.UserEntity;
import com.egg.start.security.repository.UserRepository;

@Service
public class UserServiceImplement implements UserDetailsService{
	private UserRepository userRepo;
	
	@Autowired
	public UserServiceImplement(UserRepository userRepo) {
		this.userRepo = userRepo;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = userRepo.findByUsername(username);
		if(!Objects.isNull(user)) {
			//created list for save permise
			List<GrantedAuthority> authority = new ArrayList<>();
			//Created a list of permise
			GrantedAuthority authority1 = new SimpleGrantedAuthority("ROLE_"+user.getRol());
			//Save in the list a list permise
			authority.add(authority1);
		}
		return null;
	}

}
