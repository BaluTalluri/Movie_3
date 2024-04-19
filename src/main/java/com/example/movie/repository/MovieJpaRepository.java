/*
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

package com.example.movie.repository;

import com.example.movie.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
public interface MovieJpaRepository extends JpaRepository<Movie, Integer> {

}
