package com.example.bookservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private int publicationYear;


    public Book(Long id, String title, String author, int  publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear =  publicationYear;
    }

    public Book() {

    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String autor){
        this.author = autor;
    }
    public String getAuthor(){
        return author;
    }

    public void setPublicationYear(int  publicationYear){
        this. publicationYear =  publicationYear;
    }
    public int getPublicationYear(){
        return  publicationYear;
    }
}

