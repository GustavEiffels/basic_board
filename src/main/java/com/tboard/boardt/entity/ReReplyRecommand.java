package com.tboard.boardt.entity;

import javax.persistence.Entity;

import com.tboard.boardt.common.entity.DefaultSetting;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class ReReplyRecommand extends DefaultSetting
{
    private String reReply_type;
}
