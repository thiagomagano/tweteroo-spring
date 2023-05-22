package com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
}
