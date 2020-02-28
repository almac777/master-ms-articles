package at.ac.fhcampus.master.micro.article.repositories;

import at.ac.fhcampus.master.micro.article.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
