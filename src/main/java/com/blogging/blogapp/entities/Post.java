package com.blogging.blogapp.entities;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer postId;
    @Column(name = "post_title", nullable = false, length = 100)
    private String title;
    @Column(length = 1000)
    private String content;

    private String imageName;

    private Date addedDate;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;




}
