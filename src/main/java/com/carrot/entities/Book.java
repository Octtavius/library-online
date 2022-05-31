package com.carrot.entities;

import com.carrot.enums.Genres;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(generator="book_id_seq")
    @SequenceGenerator(name="book_id_seq",sequenceName="MY_SEQ", allocationSize=1)
    @Column
    private Long pkBookId;

    @Column
    private String title;

    @Column
    private String shortDesc;

//    @Column
//    private Long fkAuthorId;

    @Column
    @Enumerated(EnumType.STRING)
    private Genres genre;

    @Column
    private Date publishedDate;

    @Column
    private Date uploadedDate;

    @Column
    private Date modifiedDate;

    public Book(){}

    public Book(String title, String shortDesc, Long fkAuthorId, Genres genre, Date publishedDate, Date uploadDate, Date modifiedDate) {
        this.title = title;
        this.shortDesc = shortDesc;
//        this.fkAuthorId = fkAuthorId;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.uploadedDate = uploadDate;
        this.modifiedDate = modifiedDate;
    }

    public Long getPkBookId() {
        return pkBookId;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDesc() {
        return shortDesc;
    }

//    public Long getFkAuthorId() {
//        return fkAuthorId;
//    }

    public Genres getGenre() {
        return genre;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public Date getUploadedDate() {
        return uploadedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }
}
