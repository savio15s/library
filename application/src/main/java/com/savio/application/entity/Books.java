package com.savio.application.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Books {

    @Id
    int bookId;
    
    int quantity;
    String bookName;
    String genre;
    
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "books [bookId=" + bookId + ", bookName=" + bookName + ", genre=" + genre + ", quantity=" + quantity
                + "]";
    }
    
}
