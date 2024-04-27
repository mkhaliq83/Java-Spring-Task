package com.library.testproject.librarytestproject.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book_borrowers")
@Data
public class BookBorrower implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrower_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @Column(name = "borrowed_date")
    private Date borrowedDate;
}
