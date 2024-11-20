package com.GestaoUser.API.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestaoUser.API.model.RH_user;
import com.GestaoUser.API.model.users_db;
import com.GestaoUser.API.repository.repository_rh_user;
import com.GestaoUser.API.repository.repository_usersdb;



@Service
public class UsersdbSevice {

	@Autowired
	private repository_usersdb usd;
	
	public List<users_db> listall(){
		
		return usd.findAll();
	}
	public users_db save(users_db us) {
		
	return usd.save( us);	
	}

	public users_db buscarid(int  id) {

		return usd.buscarid(id);
	}


	public users_db userdb_Username(String Username) {
		
		return usd.buscarUsername(Username);
	}
	
	public int verficaUsername(String Username) {
		
		return usd.verficaUsername(Username);
	}
}
