package edu.xatu.entity;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user")
@Data
public class User {
    @Id
    private int uid;
    private String username;
    private String password;
    private String uname;
}
