package migi.springframework.didemo.controllers;

import migi.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; // Little trick, but it's recommendend to use the qualifier

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}