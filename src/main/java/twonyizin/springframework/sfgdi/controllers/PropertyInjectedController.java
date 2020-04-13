package twonyizin.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import twonyizin.springframework.sfgdi.Services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectionGreetingService")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting(){return greetingService.sayGreeting();}
}
