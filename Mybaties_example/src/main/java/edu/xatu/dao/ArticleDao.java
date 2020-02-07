package edu.xatu.dao;

import edu.xatu.Article;
import edu.xatu.User;
import edu.xatu.vo.SqlVo;

import java.util.List;

public interface ArticleDao {
    public List<Article> findArticleByTitlerOrAuthorOrSource(Article article);
    public List<Article> findArticleByIds(SqlVo ids);
    public User findUserById(int id);
}
