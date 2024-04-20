package com.library.testproject.librarytestproject.libraryModel;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Borrower {
@EmbeddedId
private BorrowerId borrowerId;
private Date borrowedDate;




}
