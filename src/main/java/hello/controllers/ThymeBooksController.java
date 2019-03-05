package hello.controllers;

import hello.models.Book;
import hello.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThymeBooksController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public String showBooks(Model model) {
        model.addAttribute("book", new Book()); // New Book to add
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

    @PostMapping("/books")
    public String addBook(@ModelAttribute("book") Book book){
        bookRepository.save(book);
        return "thankyou";
    }

}

