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
    @Column(name = "client_id")
    private Long id;
    @Column(name = "client_first_name")
    private String clientFirstName;
    @Column(name = "client_last_name")
    private String clientLastName;
    @Column(name = "client_dob")
    private String clientDOB;
    @Column(name = "client_email")
    private String email;
    @Column(name = "client_occupation")
    private String clientOccupation;
}
