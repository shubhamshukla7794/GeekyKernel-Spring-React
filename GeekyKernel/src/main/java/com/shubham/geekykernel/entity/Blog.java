package com.shubham.geekykernel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog")
@Getter
@Setter
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id")
    private Long id;

    @Column(name = "blogname")
    private String blogname;

    @Column(name = "blogcontent")
    @Lob
    private String blogcontent;

    @Column(name = "postDate")
    private Date postDate;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "status")
    private String status;

    @Column(name = "likes")
    private int  likes;

    @Column(name = "dislikes")
    private int dislikes;

    public Blog() {
    }

    public Blog(String blogname, String blogcontent, Date postDate, String username, String status, int likes, int dislikes) {
        this.blogname = blogname;
        this.blogcontent = blogcontent;
        this.postDate = postDate;
        this.username = username;
        this.status = status;
        this.likes = likes;
        this.dislikes = dislikes;
    }
}
