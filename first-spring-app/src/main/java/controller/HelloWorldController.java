package controller;

import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HellowWorldService;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    @Autowired
    private HellowWorldService helloWorldService;


    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Caio");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + filter;
    }
}
