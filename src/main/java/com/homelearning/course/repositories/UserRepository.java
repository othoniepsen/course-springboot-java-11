package com.homelearning.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homelearning.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
