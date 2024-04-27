package com.library.testproject.librarytestproject.libraray.service;
import com.library.testproject.librarytestproject.library.model.BookBorrower;
import java.util.List;
import java.util.Optional;

public interface BookBorrowerService {

    public BookBorrower saveBorrower(BookBorrower borrower) ;
    List<BookBorrower> getAllBookBorrowers();
    public Optional<BookBorrower> getBookBorrowerById(Long bookBorrowerid);
    public void deleteBorrower(Long id);
}
