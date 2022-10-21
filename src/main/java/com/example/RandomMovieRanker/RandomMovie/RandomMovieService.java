package com.example.RandomMovieRanker.RandomMovie;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RandomMovieService {
    private RestTemplate restTemplate = new RestTemplate();

    List<RandomMovie> movies = new ArrayList<>();

    public RandomMovie getRandomMovie() {
        RandomMovie randomMovie = restTemplate.getForObject(
                "https://k2maan-moviehut.herokuapp.com/api/random", RandomMovie.class);

        movies.add(randomMovie);

        return randomMovie;
    }

    public List<RandomMovie> getMovies() {
        return movies;
    }

    public void setUserRating(String userRating, String id) {
        for (RandomMovie movie : movies) {
            if (movie.get_id().equals(id)) {
                movie.setUserRating(Double.parseDouble(userRating));
            }
        }
    }
}
