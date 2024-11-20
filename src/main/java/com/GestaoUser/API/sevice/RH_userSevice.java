package com.GestaoUser.API.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestaoUser.API.model.RH_user;
import com.GestaoUser.API.repository.repository_rh_user;



@Service
public class RH_userSevice {

	@Autowired
	private repository_rh_user rh;
	
	public List<RH_user> listall(){
		
		return rh.findAll();
	}
	public RH_user save(RH_user rh_user) {
		
	return rh.save(rh_user);	
	}
}
