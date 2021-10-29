package com.savio.application.service;

import java.util.List;
import javax.transaction.Transactional;
import com.savio.application.entity.Books;
import com.savio.application.repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BooksManagerImple implements BooksManager {
    
    @Autowired
    private BooksRepo repo;

    @Override
    public void save(Books bo){

        repo.save(bo);
    }

    @Override
    public List<Books> fetchBooksByGenre(String genre){
        return repo.findByGenre(genre);
    }
    @Override
    public List<Books> fetchBooks(){
        return repo.findAll();
    }
    @Override
    public Books fetchBooksById(int id){
        return repo.findById(id);
    }

    @Override
    public void delete(Books bo){
        repo.delete(bo);
    }
}
