package com.firebasedemo.firebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class service {
    @Autowired
    private FeedPostIml repo;

    public boolean dataPersistObject(FeedPostDTO feedpostDTO) {
        FeedPost feedpost=new FeedPost();                  // creating an object of entity class  for persisting it into database
        feedpost.name=feedpostDTO.name;
        feedpost.image=feedpostDTO.image;
        feedpost.content=feedpostDTO.content;
        return dataPersistObjectPopulate(feedpost);
    }

    public  boolean  dataPersistObjectPopulate(FeedPost feedpost){
        return save(feedpost);
    }

    public boolean save(FeedPost feedpost){
        try{
            repo.savefeed(feedpost);
            return true;
        }
        catch (Exception Submitfailed)
        {
            return false;
        }
    }
}