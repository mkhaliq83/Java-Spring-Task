package com.library.testproject.librarytestproject.library.controller;

import com.library.testproject.librarytestproject.libraray.service.BorrowerService;
import com.library.testproject.librarytestproject.library.model.Borrower;
import com.library.testproject.librarytestproject.library.model.BookBorrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrower")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @GetMapping
    public ResponseEntity<List<Borrower>> getAllBorrowers() {
        return ResponseEntity.ok(borrowerService.getAllBorrowers());
    }
    @PostMapping
    public ResponseEntity<Borrower> createBorrower(@RequestBody Borrower borrower) {
        borrowerService.saveBorrower(borrower);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Borrower> deleteBorrower(@PathVariable BookBorrower id) {
        borrowerService.deleteBorrower(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
