package com.firebasedemo.firebase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter@Setter
@AllArgsConstructor@NoArgsConstructor
public class FeedPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
   public String name;
    public String image;
    public String content;

    public String getName() {
        return name;
    }
}
