package com.example.bookservice.controller;

import com.example.bookservice.entity.Book;
import com.example.bookservice.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookservice){
        this.bookService = bookservice;
    }

    @GetMapping("/book")
    public List<Book> getBook(){
        return bookService.findAllBook();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id,book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id){
        bookService.deleteBook(id);
    }



}
