package at.ac.fhcampus.master.micro.article.converters;

import at.ac.fhcampus.master.micro.article.dtos.ArticleDto;
import at.ac.fhcampus.master.micro.article.entities.Article;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ArticleToDtoConverter implements Converter<Article, ArticleDto> {
    @Override
    public ArticleDto convert(Article source) {
        return ArticleDto.builder()
                .id(source.getId())
                .url(source.getUrl())
                .build();
    }
}
