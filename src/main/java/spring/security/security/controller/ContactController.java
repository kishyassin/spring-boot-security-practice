package spring.security.security.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ContactController {
    @GetMapping("/contact")
    public String getContactDetails() {
        return "Contact Details";
    }
}
