package ru.gubernik.stars.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gubernik.stars.service.PageService;
import ru.gubernik.stars.view.PageView;

import java.util.List;

@RestController
@RequestMapping("/pages")
public class PageController {

    private final PageService pageService;

    @Autowired
    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping
    public List<PageView> pages() {
        return pageService.getPages();
    }
}
