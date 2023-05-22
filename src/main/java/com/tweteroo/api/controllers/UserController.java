package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.models.Users;
import com.tweteroo.api.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin

public class UserController {
  @Autowired
  private UserRepository repository;

  @PostMapping("/sign-up")
  public void signUp(@RequestBody UserDTO req) {
    repository.save(new Users(req));
  }
}
