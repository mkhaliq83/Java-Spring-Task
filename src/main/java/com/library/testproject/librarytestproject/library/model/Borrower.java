package com.library.testproject.librarytestproject.library.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "borrowers")
@Data
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrower_id")
    private Long id;

}
