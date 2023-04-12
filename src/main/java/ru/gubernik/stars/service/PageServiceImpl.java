package ru.gubernik.stars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gubernik.stars.exception.PageNotFoundException;
import ru.gubernik.stars.model.Page;
import ru.gubernik.stars.model.Rating;
import ru.gubernik.stars.repository.PageRepository;
import ru.gubernik.stars.view.PageView;
import ru.gubernik.stars.view.RatingDto;

import java.util.ArrayList;
import java.util.List;


@Service
public class PageServiceImpl implements PageService {

    private final PageRepository pageRepository;

    @Autowired
    public PageServiceImpl(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @Override
    public Page getByCode(String code) {

        Page page = pageRepository.findByCode(code);

        if (page == null) {
            throw new PageNotFoundException(code);
        }

        return page;
    }

    @Override
    public List<PageView> getPages() {

        List<Page> pages = pageRepository.findAll();
        List<PageView> views = new ArrayList<>();

        for (Page page : pages) {
            PageView view = new PageView();
            view.setCode(page.getCode());
            view.setDescription(page.getDescription());

            List<RatingDto> ratings = new ArrayList<>();
            for (Rating rating : page.getRatings()) {
                RatingDto ratingDto = new RatingDto(rating.getStars(), rating.getComment(), page.getCode());
                ratings.add(ratingDto);
            }
            view.setRatings(ratings);
            views.add(view);
        }

        return views;
    }
}
