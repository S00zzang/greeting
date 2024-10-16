package shop.samdul.greeting.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
    Stack<String> names = new Stack<>();

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam (
            name = "name",
            required = false,
            defaultValue = "HI"
        ) String name, Model model
    ) {
        names.push(name);
        model.addAttribute("names", names);
        return  "greeting";
    }
}
