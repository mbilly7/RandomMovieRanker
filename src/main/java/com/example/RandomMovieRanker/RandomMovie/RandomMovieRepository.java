package com.example.RandomMovieRanker.RandomMovie;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RandomMovieRepository extends CrudRepository<RandomMovie, String> {
    List<RandomMovie> findAll();
    RandomMovie findBy_id(String id);
}