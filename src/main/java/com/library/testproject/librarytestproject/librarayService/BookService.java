package com.library.testproject.librarytestproject.librarayService;
import com.library.testproject.librarytestproject.libraryModel.Book;
import com.library.testproject.librarytestproject.libraryRepository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> fetchAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> fetchBookById(Integer id) {
        return bookRepository.findById(id);
    }
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
    public void deleteBookById(Integer id) {
        bookRepository.deleteById(id);
    }
}