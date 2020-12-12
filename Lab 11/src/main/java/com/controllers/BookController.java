package com.controllers;

import com.book.Book;
import com.persistence.implementation.BookRepositoryAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookRepositoryAdapter bookRepository;

    public BookController(BookRepositoryAdapter bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable("bookId") Long bookId) {
        return new ResponseEntity<>(bookRepository.getById(bookId), HttpStatus.FOUND);
    }

    @PostMapping("/save")
    public ResponseEntity<Long> save(@RequestBody Book book) {
        return new ResponseEntity<>(bookRepository.save(book), HttpStatus.OK);
    }
}
