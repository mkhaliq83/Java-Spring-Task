package com.library.testproject.librarytestproject.library.model;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;


@Entity
@Table(name = "clients")
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "client_first_name")
    private String clientFirstName;
    private String clientLastName;
    private String clientDOB;
    private String clientOccupation;
}
