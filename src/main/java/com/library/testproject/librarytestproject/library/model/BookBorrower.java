package com.library.testproject.librarytestproject.library.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Table(name = "book_borrowers")
@Data
public class BookBorrower implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Book book;
    @ManyToOne
    private Client client;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookBorrower that = (BookBorrower) o;
        return Objects.equals(book, that.book) &&
                Objects.equals(client, that.client) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, client, id);
    }
}
