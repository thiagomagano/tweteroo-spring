package com.tweteroo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.Tweets;
import com.tweteroo.api.services.TweetService;

@RestController
@RequestMapping("api/tweets")
@CrossOrigin
public class TweetController {
    @Autowired
    TweetService service;

    @PostMapping
    public Tweets PostTweet(@RequestBody TweetDTO req) {
        return service.PostTweetService(req);
    }

    @GetMapping
    public List<Tweets> getAllTweets() {
        return service.getTweets();
    }
            
}
