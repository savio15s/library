// package com.savio.sb.hw.springboothw.controller;

// import com.savio.sb.hw.springboothw.dto.BooksDTO;
// import com.savio.sb.hw.springboothw.entity.Books;
// import com.savio.sb.hw.springboothw.service.BooksManager;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.ModelAndView;

// @RestController
// public class AddController {


//     @Autowired
//     private BooksManager bService;


//     @RequestMapping("add")
//     public ModelAndView add(BooksDTO bo){
//         ModelAndView mv = new ModelAndView();
//         mv.addObject("obj",bo);
//         mv.setViewName("add");
//         return mv;
//     }

//     @RequestMapping("/addBook")
//     @ResponseBody
//     public Books addBook(BooksDTO bo)
//     {
//         Books bobj = new Books();
//         bobj.setBookId(bo.getBookId());
//         bobj.setQuantity(bo.getQuantity());
//         bobj.setBookName(bo.getBookName());
//         bobj.setGenre(bo.getGenre());
//         bService.save(bobj);
//         return bobj;
//     }
    
    
// }
