package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.GreetngService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetngService greetngService;

    public MyController(GreetngService greetngService) {
        this.greetngService = greetngService;
    }

    public String sayHello() {
        return greetngService.sayGreeeting();
    }

}
