package com.example.boardprojectspringbootbackend.repository;

import com.example.boardprojectspringbootbackend.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
