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
public class Board extends DefaultSetting
{
    private String board_title;

    @OneToMany
    @JoinColumn(name = "board_pid")
    private List<BoardAuth> boardAuths = new ArrayList<>();


    @OneToMany
    @JoinColumn(name = "board_pid")
    private List<Post> postes = new ArrayList<>();
}
