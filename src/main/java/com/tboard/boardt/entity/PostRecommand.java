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
public class PostRecommand extends DefaultSetting 
{
    // 하나의 게시글에는 다수의 게시글 추천이 달려있을 수 있기 때문
    @OneToMany
    @JoinColumn(name = "post_recommand_pid")
    private List<Post> postes = new ArrayList<>();


    private String post_good_or_bad;
    
}
