package at.ac.fhcampus.master.micro.article.services;

import at.ac.fhcampus.master.micro.article.dtos.ArticleDto;

import java.util.List;

public interface ArticleService {

    ArticleDto register(ArticleDto articleDto);

    List<ArticleDto> list();

    ArticleDto show(Long id);
}
