package ru.gubernik.stars.service;

import ru.gubernik.stars.view.PageView;
import ru.gubernik.stars.view.RatingDto;

import java.util.List;

public interface RatingService {

    /**
     * Добавить новый рейтинг страницы
     *
     * @param ratingDto данные по рейтингу
     */
    void addRating(RatingDto ratingDto);

}
