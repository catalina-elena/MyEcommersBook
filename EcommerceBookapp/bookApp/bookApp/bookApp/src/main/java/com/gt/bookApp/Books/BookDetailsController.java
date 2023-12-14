package com.gt.bookApp.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookDetailsController {

    private final BooksDetailsService bookService;

    @Autowired
    public BookDetailsController(BooksDetailsService bookService){
        this.bookService=bookService;
    }
    @GetMapping("/getAll")
    public List<BooksDetails> getBooks(){
        return bookService.getBooks();

    }
    @GetMapping("/getById/{id}")
    public BooksDetails getBookByID(@PathVariable Integer id) {
        return bookService.getBookByID(id);
    }
     @PostMapping("/save/")
    public void addNewBooks(@RequestBody BooksDetails books){
        bookService.addNewBooks(books);

    }

    @PutMapping("/updateById/{id}")
    public void updateBookByID(@PathVariable Integer id, @RequestBody BooksDetails book) {
        bookService.updateBook(id, book);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteBook(@PathVariable() Integer id){
        bookService.deleteBook(id);

    }
}
