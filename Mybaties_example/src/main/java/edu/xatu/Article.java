package edu.xatu;

import lombok.Data;

import java.util.Date;
@Data
public class Article {
    private int aid;
    private String title;
    private String content;
    private String author;
    private String source;
    private Date createTime;
    private int cid;
}
