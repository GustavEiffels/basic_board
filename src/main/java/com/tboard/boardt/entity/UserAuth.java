package com.tboard.boardt.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.tboard.boardt.common.entity.DefaultSetting;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class UserAuth extends DefaultSetting
{

    // email 
    private String          user_auth_email;

    // password 
    private String          user_auth_password;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_pid")
    private User            user;
    

    // 한명의 유저가 여러개의 게시글 작성이 가능하기 때문
    @OneToMany
    @JoinColumn(name = "user_auth_pid")
    private List<Post> postes = new ArrayList<>();

    
    @OneToMany
    @JoinColumn(name = "user_auth_pid")
    private List<PostRecommand> postRecommands = new ArrayList<>();


    @OneToMany
    @JoinColumn(name = "user_auth_pid")
    private List<Reply> reply_list = new ArrayList<>();


    @OneToMany
    @JoinColumn(name = "user_auth_pid")
    private List<ReplyRecommand> reply_recommand_list = new ArrayList<>();

    


    @OneToMany
    @JoinColumn(name = "user_auth_pid")
    private List<ReReply> reReply_list = new ArrayList<>();

    

    @OneToMany
    @JoinColumn(name = "user_auth_pid")
    private List<ReReplyRecommand> ReReplyRecommand_list = new ArrayList<>();
}

