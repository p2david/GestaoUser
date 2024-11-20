package com.GestaoUser.API.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GestaoUser.API.model.RH_user;
import com.GestaoUser.API.model.users_db;




@Repository
public interface repository_usersdb extends JpaRepository<users_db,Integer>{

	
	@Transactional()
	@Query(value ="SELECT * FROM users  WHERE username=?1",nativeQuery = true)
	public users_db buscarUsername(String Username);
	
	@Transactional()
	@Query(value ="SELECT COUNT(Username) FROM users  WHERE Username=?1",nativeQuery = true)
	public int verficaUsername(String Username);

	@Transactional()
	@Query(value ="SELECT * FROM users  WHERE id=?1",nativeQuery = true)
	public users_db buscarid(int id);
}
