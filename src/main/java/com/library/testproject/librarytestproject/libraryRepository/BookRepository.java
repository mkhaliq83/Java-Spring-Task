package com.library.testproject.librarytestproject.libraryRepository;


import com.library.testproject.librarytestproject.libraryModel.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
