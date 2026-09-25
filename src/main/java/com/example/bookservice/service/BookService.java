package com.example.bookservice.service;

import com.example.bookservice.repository.BookRepository;
import org.springframework.stereotype.Service;
import com.example.bookservice.entity.Book;

import java.util.List;
import java.util.Optional;


@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // 1.Show all list of book.
    public List<Book> findAllBook() {
        return bookRepository.findAll();

    }
    // 2.Show book only by id
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // 3.Save/add new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // 4.Update the information in book
    public Book updateBook(Long id, Book book) {
        book.setId(id);
        return bookRepository.save(book);
    }

    // 5.Delete book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
