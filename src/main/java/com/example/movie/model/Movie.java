/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

package com.example.movie.model;

import javax.persistence.*;

@Entity
@Table(name = "movielist")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movieid")
    private int movieId;

    @Column(name="moviename")
    private String movieName;

    @Column(name="leadactor")
    private String leadActor;

    public Movie() {}

    public Movie(int movieId, String movieName, String leadActor) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.leadActor = leadActor;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getMovieId() {
        return this.movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getLeadActor() {
        return this.leadActor;
    }

}