package com.abd.hospitalmgt;

import java.util.Collection;
import java.util.Collections;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abd.hospitalmgt.entity.Patient;

@SessionAttributes({"email"})
public class UserDetailsImpl implements UserDetails{


	

	
	private Patient pat;
	
	public UserDetailsImpl(Patient pat) {
		super();
		System.out.println("-----------"+pat);
		this.pat = pat;
	}
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority sga = new SimpleGrantedAuthority(pat.getRole());
		System.out.println(pat.getRole());
		System.out.println(sga);
		return Collections.singleton(sga);
	}

	@Override
	public String getPassword() {
		System.out.println(pat.getPassword());
		return pat.getPassword();
	}

	@Override
	public String getUsername() {
		System.out.println(pat.getUsername());
		return pat.getUsername();
	}


	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	

}
