package com.library.testproject.librarytestproject.libraryRepository;

import com.library.testproject.librarytestproject.libraryModel.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRespository extends JpaRepository<Author, Integer> {
}
