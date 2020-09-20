package com.zensar.service;

import com.zensar.repository.LoginRepository;

public class LoginService {

	LoginRepository repository=new LoginRepository();

	public boolean isValiduser(String username,String password) {
		return repository.isValiduser(username, password);
	}
}
