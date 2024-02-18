package com.example.GB_Eml2Sem6SpringCore.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String author;
    private String title;
    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
