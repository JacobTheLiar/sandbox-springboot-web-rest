package pl.jacob_the_liar.test.web_api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date : 2019-11-06 17:26
 * *
 * @className: App
 * *
 * *
 ******************************************************/
@SpringBootApplication
@Import(WebConfig.class)
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
