import model.Arch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Home {

    @RequestMapping("/")
    Arch home() {
        return new Arch("hello");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Home.class, args);
    }

}