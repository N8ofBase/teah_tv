package com.prismcortex.teah_tv.controllers;

import com.prismcortex.teah_tv.data.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoviesController {

    @Autowired
    private MoviesRepository moviesRepository;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "ALL MY MOVIES");
        return "movies";
    }

    @GetMapping
    public String displayAllMovies(Model model) {
        model.addAttribute("movies", moviesRepository.findAll());
        return "movies";
    }

    @GetMapping("add")
    public String addMovies(Model model) {

        return "movies/add";
    }

}
