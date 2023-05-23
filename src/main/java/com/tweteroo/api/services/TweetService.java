package com.tweteroo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.Tweets;
import com.tweteroo.api.repository.TweetRepository;;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository tweetRepository;
    

    public Tweets PostTweetService(TweetDTO data){
        return tweetRepository.save(new Tweets(data));
    }

    public List<Tweets> getTweets() {
        return tweetRepository.findAll(); 
    }
}
