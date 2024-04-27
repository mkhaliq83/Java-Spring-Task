package com.library.testproject.librarytestproject.library.model;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Table(name = "books")
@Data
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    Long id;
    @OneToOne
    @JoinColumn(name = "author_Id")
    Author author;
    @Column(name = "book_name")
    String bookName;
    @Column(name = "genre")
    String genre;
}
