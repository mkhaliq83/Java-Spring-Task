package com.library.testproject.librarytestproject.library.repository;

import com.library.testproject.librarytestproject.library.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
