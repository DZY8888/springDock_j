import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DZY on 2019/8/7.
 */
@SpringBootApplication
@RestController
@ComponentScan("entity")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "docker部署成功......###";
    }


}
