package ru.obrubov.os.backexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mobrubov
 * Created on 22.11.2020
 */
@RequestMapping("/hello")
@RestController
public class HelloWorldController {
    @GetMapping
    public String hello() {
        return "It works";
    }
}
