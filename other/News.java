package eud.xatu;

import java.util.ArrayList;
import java.util.List;

public class News {
    public static List<News> news=new ArrayList<>();

   static{
        news.add(new News(1111,"aaa","eee"));
        news.add(new News(1112,"bbb","ddd"));
        news.add(new News(1113,"ccc","fff"));
    }

    private int id;
    private String title;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}
