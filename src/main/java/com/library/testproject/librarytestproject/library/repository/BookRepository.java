package com.library.testproject.librarytestproject.library.repository;


import com.library.testproject.librarytestproject.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
