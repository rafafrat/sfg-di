package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.GreetngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller

public class SetterInjectionController {
    private GreetngService greetngService;
    @Autowired
    public void setGreetngService(@Qualifier("setterInjectionGreetingService") GreetngService greetngService) {
        this.greetngService = greetngService;
    }

    public String getGreeting() {
        return greetngService.sayGreeeting();
    }
}
