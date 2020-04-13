package twonyizin.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import twonyizin.springframework.sfgdi.Services.GreetingService;

@Controller
public class ConstructoriInjectedController {
    private final GreetingService greetingService;

    public ConstructoriInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){return greetingService.sayGreeting();}
}
