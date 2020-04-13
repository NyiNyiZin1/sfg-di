package twonyizin.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import twonyizin.springframework.sfgdi.Services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(/*@Qualifier("propertyInjectionGreetingService")*/ GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
    return greetingService.sayGreeting();
}
}
