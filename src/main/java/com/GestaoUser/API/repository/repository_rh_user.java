package com.GestaoUser.API.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GestaoUser.API.model.RH_user;



@Repository
public interface repository_rh_user extends JpaRepository<RH_user,Integer>{

	
}
