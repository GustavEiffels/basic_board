package com.tboard.boardt.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.tboard.boardt.common.entity.DefaultSetting;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Reply extends DefaultSetting 
{
    private String reply_content;


    @OneToMany
    @JoinColumn(name = "reply_pid")
    private List<ReReply> reReply_list = new ArrayList<>();


    @OneToMany
    @JoinColumn(name = "reply_pid")
    private List<ReplyRecommand> reply_recommand_list = new ArrayList<>();
}
