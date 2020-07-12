package com.firebasedemo.firebase;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface FeedRepo {
    public  boolean savefeed(FeedPost feed) throws ExecutionException, InterruptedException;

    public List<FeedPost> getlist(String name);
}
