package pl.jacob_the_liar.test.web_api;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-11-06 17:28
 * *
 * @className: SimpleObject
 * *
 * *
 ******************************************************/
public class SimpleObject{
    
    private int id;
    private String message;
    
    
    public SimpleObject(int id, String message){
        this.id = id;
        this.message = message;
    }
    
    
    public int getId(){
        return id;
    }
    
    
    public void setId(int id){
        this.id = id;
    }
    
    
    public String getMessage(){
        return message;
    }
    
    
    public void setMessage(String message){
        this.message = message;
    }
}
