package guru.sprinframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetngService {
    @Override
    public String sayGreeeting() {
        return "Hello World - Property";
    }
}
