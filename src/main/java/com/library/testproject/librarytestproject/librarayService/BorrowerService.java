package com.library.testproject.librarytestproject.librarayService;

import com.library.testproject.librarytestproject.libraryRepository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.testproject.librarytestproject.libraryModel.BorrowerId;
import com.library.testproject.librarytestproject.libraryModel.Borrower;
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

    public Optional<Borrower> getBorrowerById(BorrowerId borrowerId) {
        return borrowerRepository.findById(borrowerId);
    }

    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    public void deleteBorrower(BorrowerId borrowerId) {
        borrowerRepository.deleteById(borrowerId);
    }
}
