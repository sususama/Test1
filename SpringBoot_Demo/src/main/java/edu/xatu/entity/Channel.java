package edu.xatu.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_channel")
@Data
public class Channel {
    @Id
    @GeneratedValue(generator = "JDBC")
    private int cid;
    private String cname;
    private String description;
}
