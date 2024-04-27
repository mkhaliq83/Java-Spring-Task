package com.library.testproject.librarytestproject.libraray.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClientDto implements Serializable {
    private Long id;
    private String clientFirstName;
    private String clientLastName;
    private String clientDOB;
    private String clientOccupation;
}
