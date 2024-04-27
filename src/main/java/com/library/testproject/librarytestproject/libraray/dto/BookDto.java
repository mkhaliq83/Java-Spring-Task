package com.library.testproject.librarytestproject.libraray.dto;
import lombok.Data;
import java.io.Serializable;

@Data
public class BookDto implements Serializable {
    Long id;
    AuthorDto author;
    String bookName;
    String genre;
}
