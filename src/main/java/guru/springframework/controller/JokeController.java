package guru.springframework.controller;

import guru.springframework.services.JokeService;
import guru.springframework.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeServiceImpl jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJokes(Model model) {
        String randomQuote = jokeService.getJoke();
        model.addAttribute("joke", randomQuote);

        return "chucknorris";
    }
}
