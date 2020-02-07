package edu.xatu;

import lombok.Data;

import java.util.List;

@Data
public class Channel {
    private int cid;
    private String cname;
    private String description;
    private List<Article> articles;
}
