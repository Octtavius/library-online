package com.carrot.dto;

import com.carrot.entities.Book;

import java.io.Serializable;
import java.sql.Date;

public class BookDto implements Serializable {

    private Long pkBookId;
    private String title;
    private String shortDesc;
    private Long fkAuthorId;
    private Enum genre;
    private Date publishedDate;
    private Date uploadedDate;
    private Date modifiedDate;

    public BookDto(){}

    public BookDto(Book book) {
        this.pkBookId = book.getPkBookId();
        this.title = book.getTitle();
        this.shortDesc = book.getShortDesc();
        this.fkAuthorId = book.getFkAuthorId();
        this.genre = book.getGenre();
        this.publishedDate = book.getPublishedDate();
        this.uploadedDate = book.getUploadedDate();
        this.modifiedDate = book.getModifiedDate();
    }

    public BookDto(String title, String shortDesc, Long fkAuthorId, Enum genre, Date publishedDate, Date uploadDate, Date modifiedDate) {
        this.title = title;
        this.shortDesc = shortDesc;
        this.fkAuthorId = fkAuthorId;
        this.genre = genre;
        this.publishedDate = publishedDate;
        this.uploadedDate = uploadDate;
        this.modifiedDate = modifiedDate;
    }

    public void setPkBookId(Long pkBookId) {
        this.pkBookId = pkBookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public void setFkAuthorId(Long fkAuthorId) {
        this.fkAuthorId = fkAuthorId;
    }

    public void setGenre(Enum genre) {
        this.genre = genre;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setUploadedDate(Date uploadDate) {
        this.uploadedDate = uploadDate;
    }

    public void setModifiedDate(Date modifiedDate) {
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

    public Long getFkAuthorId() {
        return fkAuthorId;
    }

    public Enum getGenre() {
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
