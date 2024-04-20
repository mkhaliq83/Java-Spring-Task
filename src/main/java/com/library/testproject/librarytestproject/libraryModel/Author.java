package com.library.testproject.librarytestproject.libraryModel;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Author implements Serializable {
 @Id
private Integer authorId;
private String authorFirstName;
private String authorLastName;
private String authorEmail;
private String authorNationality;
}
