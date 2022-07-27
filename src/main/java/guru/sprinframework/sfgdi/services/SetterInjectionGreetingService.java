package guru.sprinframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionGreetingService implements GreetngService {
    @Override
    public String sayGreeeting() {
        return "Hello World - Setter";
    }
}
