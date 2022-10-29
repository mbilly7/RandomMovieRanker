package com.example.RandomMovieRanker.RandomMovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RandomMovieService {
    private RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private RandomMovieRepository randomMovieRepository;

    List<RandomMovie> movies = new ArrayList<>();

    public RandomMovie getRandomMovie() {
        RandomMovie randomMovie = restTemplate.getForObject(
                "https://k2maan-moviehut.herokuapp.com/api/random", RandomMovie.class);

        randomMovieRepository.save(randomMovie);

        return randomMovie;
    }

    public List<RandomMovie> getMovies() {
        return randomMovieRepository.findAll();
    }

    public void setUserRating(String userRating, String id) {
        RandomMovie randomMovie = randomMovieRepository.findBy_id(id);
        randomMovie.setUserRating(Double.parseDouble(userRating));
        randomMovieRepository.save(randomMovie);
    }
}
