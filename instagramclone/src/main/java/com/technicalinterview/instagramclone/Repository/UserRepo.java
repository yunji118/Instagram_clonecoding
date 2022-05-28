package com.technicalinterview.instagramclone.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.technicalinterview.instagramclone.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer>{  //users의 id가 int니까
	
	Users save(Users user);
	Users findByUserId(String userId);
}
