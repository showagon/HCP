package com.abd.hospitalmgt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abd.hospitalmgt.UserDetailsImpl;
import com.abd.hospitalmgt.entity.Patient;
import com.abd.hospitalmgt.repo.Patientrepo;


@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private Patientrepo patrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Patient pat = patrepo.findByUsername(username);
		System.out.println(pat);
		if(pat==null)
		{
			throw new UsernameNotFoundException("User are password are invalid");
		}
		
		return new UserDetailsImpl(pat);
	}

}