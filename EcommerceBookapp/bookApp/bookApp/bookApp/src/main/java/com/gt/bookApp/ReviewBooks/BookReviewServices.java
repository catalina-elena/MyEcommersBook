package com.gt.bookApp.ReviewBooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookReviewServices {

    private final BookReviewRepository bookReviewRepository;
    //constructor injection

    @Autowired
    public BookReviewServices(BookReviewRepository bookReviewRepository) {
        this. bookReviewRepository= bookReviewRepository;
    }


 /*   public List<BookReview> getReviewById(Long bookId) {
        return bookReviewRepository.findByBookId(bookId);
    }*/
 public BookReview getReviewById(Long reviewId) {
     Optional<BookReview> review = bookReviewRepository.findById(reviewId);
     return review.orElse(null);
 }

    public BookReview saveReview(BookReview review) {
        return bookReviewRepository.save(review);
    }

    public void deleteReview(Long reviewId) {
        bookReviewRepository.deleteById(reviewId);
    }

    public List<BookReview> getAllReviews() {
       return bookReviewRepository.findAll();
    }


    public List<BookReview> getReviewsByBookId(Long bookId) {
     List<BookReview> reviews= bookReviewRepository.findByBookId(bookId);
     return reviews;
    }
}
