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
public class Post extends DefaultSetting 
{
    private String post_title;

    private String post_contents;

    private String post_visit_cnt;

    @OneToMany
    @JoinColumn(name = "post_pid")
    private List<Reply> reply_list = new ArrayList<>();

    

    
    @OneToMany
    @JoinColumn(name = "post_pid")
    private List<File> file_list = new ArrayList<>();
}
