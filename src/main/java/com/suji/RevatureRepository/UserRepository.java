package com.suji.RevatureRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suji.RevatureApplication.User;
@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
	@Query(value="select * from user where USERNAME=?1 and PASSWORD=?2",nativeQuery=true)
	User loginUser(String username,String password);
@Query(value="update user set password=?1 where Username=?2",nativeQuery=true)

User passwordUpdate(String username, String password);
}
  