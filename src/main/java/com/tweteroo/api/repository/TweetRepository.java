package com.tweteroo.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.Tweets;

public interface TweetRepository extends JpaRepository<Tweets, Long> {
    List<Tweets> findByUsername(String username);
}
