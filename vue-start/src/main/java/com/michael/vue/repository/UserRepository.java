package com.michael.vue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michael.vue.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
