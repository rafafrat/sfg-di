package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.GreetngService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetngService greetngService;

    public I18nController(@Qualifier("i18nService") GreetngService greetngService) {
        this.greetngService = greetngService;
    }

    public String sayHello() {
        return greetngService.sayGreeeting();
    }
}
