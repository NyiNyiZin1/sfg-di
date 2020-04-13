package twonyizin.springframework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectionGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {

        return "HelloWorld  - Property";
    }
}
