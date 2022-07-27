package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.GreetngService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private final GreetngService greetngService;

   // @Autowired  // not required for constructor based injection
    public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetngService greetngService) {
        this.greetngService = greetngService;
    }

    public String getGreeting() {
        return greetngService.sayGreeeting();
    }
}
