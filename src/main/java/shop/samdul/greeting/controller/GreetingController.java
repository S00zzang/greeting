package shop.samdul.greeting.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {
    Stack<People> names = new Stack<>();

    @GetMapping("/greeting")
    public String greeting(
        @RequestParam (
            name = "name",
            required = false,
            defaultValue = "HI"
        ) String name, Model model
    ) {
        People  p = new People();
        p.name = name;
        p.num = names.size() + 1;
        names.add(p);
        model.addAttribute("names", names);
        return  "greeting";
    }
}
