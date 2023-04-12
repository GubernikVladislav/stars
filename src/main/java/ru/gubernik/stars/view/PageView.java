package ru.gubernik.stars.view;

import java.util.List;
import java.util.Set;

public class PageView {

    private String code;

    private String description;

    private List<RatingDto> ratings;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<RatingDto> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingDto> ratings) {
        this.ratings = ratings;
    }
}
