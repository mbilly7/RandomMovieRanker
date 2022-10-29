package com.example.RandomMovieRanker.RandomMovie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class RandomMovie {
    @Id
    private String _id;
    private String name;
    private int releaseYear;
    private String certificate;
    private String runtime;
    private String genre;
    private double imdbRating;
    private String overview;
    private double metaScore;
    private String director;
    private double userRating = -1;


    public double getUserRating() {
        return userRating;
    }

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }

    public RandomMovie() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getMetaScore() {
        return metaScore;
    }

    public void setMetaScore(double metaScore) {
        this.metaScore = metaScore;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "RandomMovie{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", certificate='" + certificate + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genre='" + genre + '\'' +
                ", imdbRating=" + imdbRating +
                ", overview='" + overview + '\'' +
                ", metaScore=" + metaScore +
                ", director='" + director + '\'' +
                '}';
    }
}
