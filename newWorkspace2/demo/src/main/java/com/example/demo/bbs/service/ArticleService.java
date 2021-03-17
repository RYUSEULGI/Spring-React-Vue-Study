package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bbs.domain.Article;

public interface ArticleService {
    public long count();
    public void deleteById(long id);
    public void deleteAll(Iterable<Article> entities);
    public Optional<Article> findById(long id);
    public List<Article> findAllById(Iterable<Article> ids);
    public Optional<Article> findOne(Article Article);
    public List<Article> findAll();
    public Article save(Article entity);
    public List<Article> saveAll(Iterable<Article> entities);
    public boolean existsById(long id);
    public Article getOne(long id);
}
