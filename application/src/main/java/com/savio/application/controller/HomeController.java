package com.savio.application.controller;
import java.util.List;
import com.savio.application.entity.Books;
import com.savio.application.entity.UBooks;
import com.savio.application.service.BooksManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
    

    // @RequestMapping("home")
    // public String home(HttpServletRequest req)
    // {
    //     HttpSession session = req.getSession();
    //     String name =req.getParameter("name");
    //     System.out.println("hello " + name);
    //     session.setAttribute("name", name);
    //     return "home.jsp";
    // }
    @Autowired
    private BooksManager bService;

    @RequestMapping("/getBooks")
    public List<Books> getBooks()
    {
        return bService.fetchBooks();
    }

    @PostMapping(value = "/saveBook")
    public Books saveBook(@RequestBody Books bo)
    {
        bService.save(bo);
        return bo;
    }

    @PostMapping(value = "/deleteBook")
    public String deleteBook(@RequestParam int bookId)
    {
        Books bo = bService.fetchBooksById(bookId);
        bService.delete(bo);
        return "Deleted Successfully";
    }
    
    @PostMapping(value = "/editBook")
    public Books updateBook(@RequestParam int bookId,@RequestBody UBooks ubo)
    {
        Books bo = new Books();
        bo.setBookId(bookId);
        bo.setBookName(ubo.getBookName());
        bo.setQuantity(ubo.getQuantity());
        bo.setGenre(ubo.getGenre());
        bService.save(bo);
        
        return bo;
    }
    @GetMapping(value = "/getByType")
    public List<Books> getBookByGenre(@RequestParam String id)
    {
        return bService.fetchBooksByGenre(id);
     
    }
    


}


