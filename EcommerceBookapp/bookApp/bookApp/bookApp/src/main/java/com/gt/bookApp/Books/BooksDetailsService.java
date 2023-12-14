package com.gt.bookApp.Books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksDetailsService {
    private final BookRepository booksRepository;

    @Autowired
    public BooksDetailsService( BookRepository booksRepository){
        this.booksRepository=booksRepository;
    }

    public  List<BooksDetails> getBooks() {
        List<BooksDetails> books= new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
       // return booksRepository.findAll();
    }

    public BooksDetails getBookByID(Integer id) {
        return booksRepository.findById(id).get();
    }
               //orElse(null);

    public void addNewBooks(BooksDetails books) {

        booksRepository.save(books);
        System.out.println(books);
    }

    public void updateBook(Integer id, BooksDetails book) {
        booksRepository.save(book);
    }
    public void deleteBook(Integer id) {
        booksRepository.deleteById(id);
    }
}
