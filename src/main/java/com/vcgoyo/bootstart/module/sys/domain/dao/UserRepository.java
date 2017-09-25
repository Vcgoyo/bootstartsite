package com.vcgoyo.bootstart.module.sys.domain.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.vcgoyo.bootstart.module.sys.domain.eneity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
