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
 @Column(name = "author_id")
 private Long id;
 @Column(name = "author_first_name")
 private String authorFirstName;
 @Column(name = "author_last_name")
 private String authorLastName;
 @Column(name = "author_email")
 private String authorEmail;
 @Column(name = "author_nationality")
 private String authorNationality;
}
