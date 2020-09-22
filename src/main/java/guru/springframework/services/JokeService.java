package guru.springframework.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public JokeService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
