package com.library.testproject.librarytestproject.libraryModel;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
public class Book implements Serializable {
@Id
Integer BookId;
@OneToOne
@JoinColumn(name = "authorID")
Author author;
String bookName;
String genre;
}
