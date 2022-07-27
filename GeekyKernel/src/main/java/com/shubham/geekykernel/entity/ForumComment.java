package com.shubham.geekykernel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "forumcomment")
@Getter
@Setter
public class ForumComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "forumcomment_id")
    private Long id;

    @Column(name = "forum_id")
    private Long forumId;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "discussionText")
    private String discussionText;

    @Column(name = "discussionDate")
    private Date discussionDate;

    public ForumComment() {
    }

    public ForumComment(Long forumId, String username, String discussionText, Date discussionDate) {
        this.forumId = forumId;
        this.username = username;
        this.discussionText = discussionText;
        this.discussionDate = discussionDate;
    }
}
