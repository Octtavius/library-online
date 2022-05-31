package com.carrot.controllers;

import com.carrot.dto.BookDto;
import com.carrot.entities.Book;
import com.carrot.enums.Genres;
import com.carrot.repositories.BookRepository;
import com.carrot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Iterable<BookDto> getAllBooks() {
        return bookService.findAllBooks();
    }

    private List<BookDto> getSampleRooms() {
        BookDto book = new BookDto();
        book.setTitle("Dune");
        book.setShortDesc("Very good book about a planet");
//        book.setFkAuthorId(711L);
        book.setGenre(Genres.SCIFI);
        book.setPublishedDate(Date.valueOf("1987-03-29"));
        book.setUploadedDate(Date.valueOf("2022-01-15"));
        book.setModifiedDate(Date.valueOf("2022-01-15"));

        BookDto book1 = new BookDto();
        book1.setTitle("A gift of Time");
        book1.setShortDesc("When Micajah Fenton discovers a crater in his front yard with a broken time glider in the bottom and a naked, virtual woman on his lawn, he delays his plans to kill himself. While helping repair the marooned time traveler’s glider, Cager realizes it can return him to his past to correct a mistake that had haunted him his entire life. ");
//        book1.setFkAuthorId(712L);
        book1.setGenre(Genres.SCIFI);
        book1.setPublishedDate(Date.valueOf("2009-01-29"));
        book1.setUploadedDate(Date.valueOf("2022-01-15"));
        book1.setModifiedDate(Date.valueOf("2022-01-15"));

        BookDto book2 = new BookDto();
        book2.setTitle("The Toymakers");
        book2.setShortDesc("It is 1917, and while war wages across Europe, in the heart of London, there is a place of hope and enchantment.\n The Emporium sells toys that capture the imagination of children and adults alike: patchwork dogs that seem alive, toy boxes that are bigger on the inside, soldiers that can fight battles of their own. Into this family business comes young Cathy Wray, running away from a shameful past. The Emporium takes her in, makes her one of its own.");
//        book2.setFkAuthorId(713L);
        book2.setGenre(Genres.FANTASY);
        book2.setPublishedDate(Date.valueOf("2015-11-09"));
        book2.setUploadedDate(Date.valueOf("2022-01-15"));
        book2.setModifiedDate(Date.valueOf("2022-01-15"));

        return Arrays.asList(book, book1, book2);
    }
}