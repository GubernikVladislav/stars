package ru.gubernik.stars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gubernik.stars.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
}
