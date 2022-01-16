package com.carrot.service;

import com.carrot.dto.BookDto;
import com.carrot.entities.Book;
import com.carrot.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Iterable<BookDto> findAllBooks() {
        return toDto(bookRepository.findAll());
    }

    private Iterable<BookDto> toDto(Iterable<Book> allBooks) {
        List<BookDto> bookDtos = new ArrayList<>();

        allBooks.forEach(book -> {
            bookDtos.add(new BookDto(book));
        });

        return bookDtos;
    }
}
