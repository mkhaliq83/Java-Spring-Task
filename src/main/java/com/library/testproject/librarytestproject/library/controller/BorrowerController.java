package com.library.testproject.librarytestproject.library.controller;

import com.library.testproject.librarytestproject.libraray.dto.BookBorrowerDto;
import com.library.testproject.librarytestproject.libraray.service.impl.BookBorrowerServiceImpl;
import com.library.testproject.librarytestproject.library.model.Borrower;
import com.library.testproject.librarytestproject.library.model.BookBorrower;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/service/bookborrower")
public class BorrowerController {

    @Autowired
    private BookBorrowerServiceImpl bookBorrowerService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<BookBorrowerDto>> getAllBookBorrowers() {
        List<BookBorrower> bookBorrowers = bookBorrowerService.getAllBookBorrowers();
        if (bookBorrowers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<BookBorrowerDto> bookBorrowerDtos = bookBorrowers.stream().map(bookBorrower ->
                modelMapper.map(bookBorrower, BookBorrowerDto.class)).collect(Collectors.toList());
        return ResponseEntity.ok(bookBorrowerDtos);
    }
    @PostMapping
    public ResponseEntity<BookBorrowerDto> createBorrower(@RequestBody BookBorrowerDto borrower) {
        BookBorrower bookBorrower = modelMapper.map(borrower, BookBorrower.class);
        bookBorrowerService.saveBorrower(bookBorrower);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Borrower> deleteBorrower(@PathVariable Long id) {
        bookBorrowerService.deleteBorrower(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
