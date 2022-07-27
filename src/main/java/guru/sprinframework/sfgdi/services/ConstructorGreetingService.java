package guru.sprinframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetngService {
    @Override
    public String sayGreeeting() {
        return "Hello World - Constructor";
    }
}
