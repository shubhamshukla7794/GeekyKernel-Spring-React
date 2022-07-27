package com.shubham.geekykernel.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "friend")
@Getter
@Setter
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "friend_id")
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "friendname", nullable = false, unique = true)
    private String friendname;

    @Column(name = "status")
    private String status;

    public Friend() {
    }

    public Friend(String username, String friendname, String status) {
        this.username = username;
        this.friendname = friendname;
        this.status = status;
    }
}
