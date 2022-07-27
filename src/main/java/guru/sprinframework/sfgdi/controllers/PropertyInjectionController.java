package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.GreetngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetngService greetngService;

    public String getGreeting() {
        return greetngService.sayGreeeting();
    }
}
