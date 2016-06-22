import model.Blog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Home {

    @RequestMapping("/blog")
    Blog home() {
        return new Blog("hello", "this is a content", "phodal", "this-is-hello", "2016-06-23");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Home.class, args);
    }

}