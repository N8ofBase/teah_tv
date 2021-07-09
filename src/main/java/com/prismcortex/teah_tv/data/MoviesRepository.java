package com.prismcortex.teah_tv.data;

import com.prismcortex.teah_tv.models.Movies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<Movies, Integer> {
}
