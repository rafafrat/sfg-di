package guru.sprinframework.sfgdi.controllers;

import guru.sprinframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionCotrollerTest {
    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetngService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}