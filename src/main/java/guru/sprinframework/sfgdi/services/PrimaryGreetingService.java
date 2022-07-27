package guru.sprinframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetngService {
    @Override
    public String sayGreeeting() {
        return "Hello World - Primary";
    }
}
