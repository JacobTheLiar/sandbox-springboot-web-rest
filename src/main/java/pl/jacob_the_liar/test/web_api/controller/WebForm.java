package pl.jacob_the_liar.test.web_api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-11-06 17:33
 * *
 * @className: WebForm
 * *
 * *
 ******************************************************/
@Controller
@RequestMapping("/web/test")
public class WebForm{
    
    @GetMapping
    public ModelAndView getTestForm(){
        System.out.println("/web/test");
        ModelAndView view = new ModelAndView("index");
        
        return view;
    }
    
    
    @GetMapping("/string")
    public ResponseEntity<String> getTestString(){
        System.out.println("/web/test/string");
        
        
        return ResponseEntity.ok("test");
    }
    
}
