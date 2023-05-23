package com.tweteroo.api.models;

import com.tweteroo.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweets {

  public Tweets (TweetDTO tweet) {
    this.username = tweet.username();
    this.text = tweet.text();
    this.avatar = tweet.avatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 144, nullable = false)
  private String text;
  
  @Column(length = 50, nullable = false)
  private String username;
  
  @Column(nullable = false)
  private String avatar;

 
}
