package ru.gubernik.stars.view;

public class RatingDto {

    private int stars;

    private String comment;

    private String pageCode;

    public RatingDto() {
    }

    public RatingDto(int stars, String comment, String pageCode) {
        this.stars = stars;
        this.comment = comment;
        this.pageCode = pageCode;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPageCode() {
        return pageCode;
    }

    public void setPageCode(String pageCode) {
        this.pageCode = pageCode;
    }
}
