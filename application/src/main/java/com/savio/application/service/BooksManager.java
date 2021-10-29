package com.savio.application.service;

import java.util.List;

import com.savio.application.entity.Books;

public interface BooksManager {
    
    void save(Books bo);
    List<Books> fetchBooksByGenre(String genre);
    List<Books> fetchBooks();
    Books fetchBooksById(int id);
    void delete(Books bo);
    
}
