package com.bezkoder.spring.files.upload.repository;

import com.bezkoder.spring.files.upload.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
