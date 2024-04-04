package com.koroliuk.app.spring_app;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListener {

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent() {
        System.out.println("Application started ... launching browser now");
        System.out.println("Visit http://localhost:8080/greeting?name=YourName");
    }
}