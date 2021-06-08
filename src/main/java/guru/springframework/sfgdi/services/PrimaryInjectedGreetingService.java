package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "say Greeting - PrimaryInjectedGreetingService";
    }
}
