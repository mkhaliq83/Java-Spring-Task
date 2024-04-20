package com.library.testproject.librarytestproject.libraryRepository;

import com.library.testproject.librarytestproject.libraryModel.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
