package com.shubham.geekykernel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "forum")
@Getter
@Setter
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forum_id")
    private Long id;

    @Column(name = "forumname")
    private String forumname;

    @Column(name = "forumcontent")
    @Lob
    private String forumcontent;

    @Column(name = "postDate")
    private Date postDate;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "status")
    private String status;

    public Forum() {
    }

    public Forum(String forumname, String forumcontent, Date postDate, String username, String status) {
        this.forumname = forumname;
        this.forumcontent = forumcontent;
        this.postDate = postDate;
        this.username = username;
        this.status = status;
    }
}
