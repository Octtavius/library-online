package com.carrot.dto;

import com.carrot.entities.Author;

public class AuthorDto {

    private Long id;
    private String firstName;
    private String lastName;

    public AuthorDto(){}

    public AuthorDto(Author author) {
        this.id = author.getId();
        this.firstName = author.getFirstName();
        this.lastName = author.getLastName();
    }

    public AuthorDto(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
