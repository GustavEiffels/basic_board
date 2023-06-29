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
public class ReReply extends DefaultSetting
{

    private String re_reply_content;

    
    @OneToMany
    @JoinColumn(name = "re_reply_pid")
    private List<ReReplyRecommand> ReReplyRecommand_list = new ArrayList<>();
    
}
