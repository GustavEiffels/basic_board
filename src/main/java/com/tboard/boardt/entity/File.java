package com.tboard.boardt.entity;

import javax.persistence.Entity;
import com.tboard.boardt.common.entity.DefaultSetting;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class File extends DefaultSetting 
{
    private String  file_name;

    private String  file_origin_name;

    private Long    file_size;

    private String  file_size_type;

    private String  file_ext;

    private String  file_path;
}
