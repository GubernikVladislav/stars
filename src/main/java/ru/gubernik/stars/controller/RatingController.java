package ru.gubernik.stars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gubernik.stars.service.RatingService;
import ru.gubernik.stars.view.RatingDto;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping
    public void addRating(@RequestBody RatingDto ratingDto) {
        ratingService.addRating(ratingDto);
    }
}
