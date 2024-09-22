package spring.security.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/myNotices")
    public String getNotices() {
        return "Notices";
    }
}
