package com.library.testproject.librarytestproject.library.repository;

import com.library.testproject.librarytestproject.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRespository extends JpaRepository<Author, Integer> {
}
