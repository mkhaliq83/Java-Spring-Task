package com.library.testproject.librarytestproject.libraray.service.impl;
import com.library.testproject.librarytestproject.libraray.service.BookBorrowerService;
import com.library.testproject.librarytestproject.library.model.BookBorrower;
import com.library.testproject.librarytestproject.library.repository.BookBorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookBorrowerServiceImpl implements BookBorrowerService {

    private final BookBorrowerRepository bookBorrowerRepository;
    @Autowired
    public BookBorrowerServiceImpl(BookBorrowerRepository bookBorrowerRepository) {
        this.bookBorrowerRepository = bookBorrowerRepository;
    }
    @Override
    public List<BookBorrower> getAllBookBorrowers() {
        return bookBorrowerRepository.findAll();
    }
    @Override
    public Optional<BookBorrower> getBookBorrowerById(Long id) {
        return bookBorrowerRepository.findById(id);
    }
    @Override
    public BookBorrower saveBorrower(BookBorrower borrower){
        return bookBorrowerRepository.save(borrower);
    }
    @Override
    public void deleteBorrower(Long id) {
        bookBorrowerRepository.deleteById(id);
    }
}
