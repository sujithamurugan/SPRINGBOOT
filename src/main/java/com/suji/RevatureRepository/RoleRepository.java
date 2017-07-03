package com.suji.RevatureRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suji.RevatureApplication.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {

}
