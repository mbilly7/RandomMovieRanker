package com.example.RandomMovieRanker.RandomMovie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RandomMovieController {
    @Autowired
    RandomMovieService randomMovieService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Billy") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
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
