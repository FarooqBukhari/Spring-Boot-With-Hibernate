package com.example.springwithhibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="BOOK")
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // standard constructors

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {
    }

    // standard getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
