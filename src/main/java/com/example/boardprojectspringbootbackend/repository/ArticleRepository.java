package com.example.boardprojectspringbootbackend.repository;

import com.example.boardprojectspringbootbackend.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}