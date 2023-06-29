package com.tboard.boardt.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import com.tboard.boardt.common.entity.DefaultSetting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter @Setter
@AllArgsConstructor
public class User extends DefaultSetting 
{
    

    private String      user_name;
        
    private String      user_nick;
    
    private String      user_rank;

    private Timestamp   user_birthday;





}
