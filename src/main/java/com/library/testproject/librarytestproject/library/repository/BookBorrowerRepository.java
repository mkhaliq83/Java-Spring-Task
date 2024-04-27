package com.library.testproject.librarytestproject.library.repository;

import com.library.testproject.librarytestproject.library.model.BookBorrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookBorrowerRepository extends JpaRepository<BookBorrower, Long> {
}
