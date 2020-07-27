package at.ac.fhcampus.master.micro.article.controllers;

import at.ac.fhcampus.master.micro.article.dtos.ArticleDto;
import at.ac.fhcampus.master.micro.article.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(ArticleController.BASE_URL)
public class ArticleController {
    static final String BASE_URL = "";
    private static final String ROOT_URL = "/";
    private static final String SHOW_URL = "/{id}";

    private final ArticleService articleService;

    @GetMapping(ROOT_URL)
    public List<ArticleDto> articles() {
        return this.articleService.list();
    }

    @GetMapping(SHOW_URL)
    public ArticleDto show(@PathVariable("id") Long id) {
        return this.articleService.show(id);
    }

    @PostMapping(ROOT_URL)
    public ArticleDto create(@RequestBody ArticleDto articleDto) {
        return this.articleService.create(articleDto);
    }

    @PutMapping(SHOW_URL)
    public ArticleDto update(@RequestBody ArticleDto articleDto, @PathVariable("id") Long id) {
        return this.articleService.update(articleDto, id);
    }

    @DeleteMapping(SHOW_URL)
    public void delete(@PathVariable("id") Long id) {
        this.articleService.delete(id);
    }
}
