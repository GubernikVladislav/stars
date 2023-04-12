package ru.gubernik.stars;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import ru.gubernik.stars.view.RatingDto;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StarsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StarsApplicationTests {

    @Value(value="${local.server.port}")
    private int port;

    private final RestTemplate restTemplate = new RestTemplate();

    @Test
    public void addRatingTest() {
        RatingDto ratingDto = new RatingDto(RandomUtils.nextInt(0, 6), RandomStringUtils.randomAlphabetic(10), "MAIN");
        restTemplate.postForEntity("http://localhost:" + port + "/ratings", ratingDto, Object.class);
    }

    @Test
    public void incorrectPageCodeTest() {
        RatingDto ratingDto = new RatingDto(RandomUtils.nextInt(0, 6), RandomStringUtils.randomAlphabetic(10), "INCORRECT");
        Assertions.assertThrows(Exception.class, () ->  restTemplate.postForEntity("http://localhost:" + port + "/ratings", ratingDto, Object.class));
    }

}
