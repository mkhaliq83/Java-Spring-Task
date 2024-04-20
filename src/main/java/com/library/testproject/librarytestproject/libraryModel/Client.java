package com.library.testproject.librarytestproject.libraryModel;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;


@Entity
@Data
public class Client implements Serializable {
@Id
private Integer clientID;
private String clientFirstName;
private String clientLastName;
private String clientDOB;
private String clientOccupation;

}
