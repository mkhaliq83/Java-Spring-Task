package com.library.testproject.librarytestproject.libraryRepository;

import com.library.testproject.librarytestproject.libraryModel.Borrower;
import com.library.testproject.librarytestproject.libraryModel.BorrowerId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository  extends JpaRepository<Borrower, BorrowerId> {
}
