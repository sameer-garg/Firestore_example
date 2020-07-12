package com.firebasedemo.firebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
    @Autowired
    private  service feedservice;


    @RequestMapping(value = "/addpost")
    public ModelAndView getForm() {                           // the url being localhost:8080/show-form?pg-id={the page id}
        FeedPostDTO feedpost= new FeedPostDTO();               // creating an object to store data from UI
        ModelAndView mav= new ModelAndView();
        mav.addObject("feedpost", feedpost);                  // sending the feedpost object to store the required user details and the feedpost
        mav.setViewName("formfeedpost");                                        // rendering the form template where the user enter details
        return mav;
    }

    @PostMapping(value = "/feedposted")
    public String postForm(@ModelAttribute("feedpost") FeedPostDTO feedpost) {
        System.out.println(feedpost.name);
        if(feedservice.dataPersistObject(feedpost))                          // calling service methods to persist data which return true if persist was a success
            return "feedpostadded";
        else
            return "fail";
    }
}



