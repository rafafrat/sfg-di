package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterSetterInjectionControllerControllerTest {
    SetterInjectionController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetngService((new ConstructorGreetingService()));
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}