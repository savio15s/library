// package com.savio.sb.hw.springboothw.controller;

// import java.util.List;

// import com.savio.sb.hw.springboothw.entity.Books;
// import com.savio.sb.hw.springboothw.service.BooksManager;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// public class FetchByGenre {

//     @Autowired
//     private BooksManager bService;
    



//     @RequestMapping("get")
//     public ModelAndView get(){
//         ModelAndView mv = new ModelAndView();
//         mv.setViewName("get");
//         return mv;
//     }


//     @RequestMapping("/getGenre")
//     public ModelAndView getGenre(@RequestParam String genre){
        
//         ModelAndView mv = new ModelAndView();
//         List<Books> lb = bService.fetchBooksByGenre(genre);
//         mv.setViewName("showgenre");
//         System.out.println("List: "+lb);
//         mv.addObject("lb",lb.toString());
//         return mv;
//     }
// }
