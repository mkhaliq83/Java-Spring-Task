package com.library.testproject.librarytestproject.libraray.dto;

import lombok.Data;

@Data
public class AuthorDto {
    private Long id;
    private String authorFirstName;
    private String authorLastName;
    private String authorEmail;
    private String authorNationality;
}
