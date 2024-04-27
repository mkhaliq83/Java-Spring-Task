package com.library.testproject.librarytestproject.libraray.dto;
import lombok.Data;
import java.util.Date;

@Data
public class BookBorrowerDto {
    private Long id;
    private BookDto bookDto;
    private ClientDto clientDto;
    private Date borrowedDate;
}
