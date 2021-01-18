package izhak.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Izhak
 */
@Controller
public class HelloController {
    @GetMapping("/hello-world")
    public String sayHelloWorld() {
        return "hello_world";
    }
}
