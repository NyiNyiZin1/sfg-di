package twonyizin.springframework.sfgdi.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "HelloWorld  - From the PRIMARY Bean";
    }
}
