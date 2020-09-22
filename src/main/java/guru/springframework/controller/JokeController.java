package guru.springframework.controller;

import guru.springframework.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJokes(Model model) {
        String randomQuote = jokeService.getRandomQuote();
        model.addAttribute("joke", randomQuote);

        return "chucknorris";
    }
}
