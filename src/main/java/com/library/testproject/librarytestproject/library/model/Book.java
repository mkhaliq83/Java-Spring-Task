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
    Integer id;
    @OneToOne
    @JoinColumn(name = "authorId")
    Author author;
    @Column(name = "book_name")
    String bookName;
    @Column(name = "genre")
    String genre;
}
