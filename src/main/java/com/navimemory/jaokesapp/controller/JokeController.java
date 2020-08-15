package com.navimemory.jaokesapp.controller;

import com.navimemory.jaokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    private String getJoke(Model model){
        System.out.println("joke" + jokeService.getJoke());
      model.addAttribute("joke", jokeService.getJoke());
      return "chucknorris";
    }
}
