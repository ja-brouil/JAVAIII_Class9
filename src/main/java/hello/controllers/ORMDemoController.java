package hello.controllers;

import hello.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.models.Book;

@Controller
@RequestMapping(path="/demo")
public class ORMDemoController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewBook(@RequestParam String title
            , @RequestParam String author) {

        Book n = new Book();
        n.setTitle(title);
        n.setAuthor(author);
        bookRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Book> getAllUsers() {
        return bookRepository.findAll();
    }


}