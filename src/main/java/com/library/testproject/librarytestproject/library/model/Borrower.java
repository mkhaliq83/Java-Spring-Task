package com.library.testproject.librarytestproject.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "borrowers")
@Data
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @EmbeddedId
    private BookBorrower bookBorrower;
    private Date borrowedDate;




}
