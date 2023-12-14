package com.gt.bookApp.ReviewBooks;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookReviewController {

    private final BookReviewServices bookReviewServices;

    //constructor injection
    @Autowired
    public BookReviewController(BookReviewServices bookReviewServices) {
        this.bookReviewServices= bookReviewServices;

    }

    @GetMapping("/{bookId}")
    public List<BookReview> getReviewsByBookId(@PathVariable Long bookId) {
        return bookReviewServices.getReviewsByBookId(bookId);
    }

    @GetMapping("/all")
    public List<BookReview> getAllReviews() {
        return bookReviewServices.getAllReviews();
    }

    @GetMapping("/review/{reviewId}")
    public BookReview getReviewById(@PathVariable Long reviewId) {
        return bookReviewServices.getReviewById(reviewId);
    }



    @PostMapping("/addReview")
    public BookReview addReview(@RequestBody BookReview review) {
        return bookReviewServices.saveReview(review);
    }

    @DeleteMapping("/delete/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        bookReviewServices.deleteReview(reviewId);
    }
}
