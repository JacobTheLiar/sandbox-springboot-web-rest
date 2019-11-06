package pl.jacob_the_liar.test.web_api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jacob_the_liar.test.web_api.SimpleObject;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-11-06 17:26
 * *
 * @className: JsonApi
 * *
 * *
 ******************************************************/
@Controller
@RequestMapping("/api/test")
public class JsonApi{
    
    
    @GetMapping
    public ResponseEntity<?> getTestApi(){
        System.out.println("/api/test");
        ResponseEntity<SimpleObject> s = ResponseEntity.ok(new SimpleObject(1, "test"));
        
        return s;
    }
    
}
