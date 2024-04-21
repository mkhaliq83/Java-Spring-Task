package com.library.testproject.librarytestproject.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "Author")
@Data
public class Author implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String authorFirstName;
 private String authorLastName;
 private String authorEmail;
 private String authorNationality;
}
