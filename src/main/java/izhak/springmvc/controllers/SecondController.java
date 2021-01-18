package izhak.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author David Izhak
 */
@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "/second/exit";
    }
}
