package com.shubham.geekykernel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blogcomment")
@Getter
@Setter
public class BlogComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blogcomment_id")
    private Long id;

    @Column(name = "blog_id")
    private Long blogId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "commentText")
    private String commentText;

    @Column(name = "commentDate")
    private Date commentDate;

    public BlogComment() {
    }

    public BlogComment(Long blogId, String username, String commentText, Date commentDate) {
        this.blogId = blogId;
        this.username = username;
        this.commentText = commentText;
        this.commentDate = commentDate;
    }
}
