package com.persistence.implementation;

import com.book.Book;
import com.persistence.interfaces.CrudRepository;
import com.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryAdapter implements CrudRepository<Book> {

    private BookRepository bookRepository;

    public BookRepositoryAdapter(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book getById(Long id) {
        return bookRepository.findById(id).orElse(new Book("Title of book 1"));
    }

    @Override
    public Long save(Book object) {
        return bookRepository.save(object).getId();
    }
}
