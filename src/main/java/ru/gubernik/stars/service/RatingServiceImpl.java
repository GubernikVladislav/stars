package ru.gubernik.stars.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gubernik.stars.model.Page;
import ru.gubernik.stars.model.Rating;
import ru.gubernik.stars.repository.RatingRepository;
import ru.gubernik.stars.view.RatingDto;

@Service
public class RatingServiceImpl implements RatingService {

    private final RatingRepository ratingRepository;
    private final PageService pageService;

    @Autowired
    public RatingServiceImpl(RatingRepository ratingRepository, PageService pageService) {
        this.ratingRepository = ratingRepository;
        this.pageService = pageService;
    }

    @Override
    public void addRating(RatingDto ratingDto) {
        Page page = pageService.getByCode(ratingDto.getPageCode());

        Rating rating = new Rating();
        rating.setStars(ratingDto.getStars());
        rating.setComment(ratingDto.getComment());
        rating.setPage(page);

        ratingRepository.save(rating);
    }
}
