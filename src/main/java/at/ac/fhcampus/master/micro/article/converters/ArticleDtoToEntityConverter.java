package at.ac.fhcampus.master.micro.article.converters;

import at.ac.fhcampus.master.micro.article.dtos.ArticleDto;
import at.ac.fhcampus.master.micro.article.entities.Article;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ArticleDtoToEntityConverter implements Converter<ArticleDto, Article> {
    @Override
    public Article convert(ArticleDto source) {
        return Article.builder()
                .id(source.getId())
                .url(source.getUrl())
                .build();
    }
}
