package com.gt.bookApp.ReviewBooks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;
    private String reviewerName;
    private String reviewerText;
    public BookReview( Long bookId, String reviewerName, String reviewerText) {
        super();
        this.bookId = bookId;
        this.reviewerName = reviewerName;
        this.reviewerText = reviewerText;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookId() {
        return bookId;
    }
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public String getReviewerName() {
        return reviewerName;
    }
    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    public String getReviewerText() {
        return reviewerText;
    }
    public void setReviewerText(String reviewerText) {
        this.reviewerText = reviewerText;
    }

}
