package edu.xatu.springmvc.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Channel {
    private int cid;
    private String cname;
    private String description;
//    @DateTimeFormat(pattern = "yyyy年MM月dd日")
    private Date date;
}
