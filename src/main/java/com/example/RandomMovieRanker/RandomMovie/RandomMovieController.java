package com.example.RandomMovieRanker.RandomMovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RandomMovieController {
    @Autowired
    RandomMovieService randomMovieService;

    @RequestMapping("/randomMovie")
    public RandomMovie getRandomMovie() {
        return randomMovieService.getRandomMovie();
    }

    @RequestMapping("/randomMovieList")
    public List<RandomMovie> getRandomMovieList() {
        return randomMovieService.getMovies();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/randomMovie/{id}")
    public void setUserRating(@RequestBody String userRating, @PathVariable String id) {
        randomMovieService.setUserRating(userRating, id);
    }
}
