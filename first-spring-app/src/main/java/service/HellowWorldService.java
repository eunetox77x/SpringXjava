package service;

import org.springframework.stereotype.Service;

@Service
public class HellowWorldService {

    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}
