package com.tourism.citytours.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.abisoft.persistence.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);

}
