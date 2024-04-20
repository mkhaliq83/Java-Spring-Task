package com.library.testproject.librarytestproject.libraryModel;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
public class BorrowerId  implements Serializable {
@ManyToOne
private Book book;
@ManyToOne
private Client client;
private Integer borrowerId;
@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorrowerId that = (BorrowerId) o;
        return Objects.equals(book, that.book) &&
                Objects.equals(client, that.client) &&
                Objects.equals(borrowerId, that.borrowerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(book, client, borrowerId);
    }
}
