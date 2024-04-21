package com.library.testproject.librarytestproject.libraray.service;

import com.library.testproject.librarytestproject.library.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.testproject.librarytestproject.library.model.BookBorrower;
import com.library.testproject.librarytestproject.library.model.Borrower;
import java.util.List;
import java.util.Optional;

@Service
public class BorrowerService {

    private final BorrowerRepository borrowerRepository;

    @Autowired
    public BorrowerService(BorrowerRepository borrowerRepository) {
        this.borrowerRepository = borrowerRepository;
    }

    public Borrower saveBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    public Optional<Borrower> getBorrowerById(BookBorrower bookBorrower) {
        return borrowerRepository.findById(bookBorrower);
    }

    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    public void deleteBorrower(BookBorrower bookBorrower) {
        borrowerRepository.deleteById(bookBorrower);
    }
}
