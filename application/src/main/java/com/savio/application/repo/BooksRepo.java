package com.savio.application.repo;
import java.util.List;
import com.savio.application.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BooksRepo extends JpaRepository<Books,Integer>{

    public List<Books> findByGenre(String genre);
    public List<Books> findAll();
    public Books findById(int id);
    public void delete(Books b);
}
