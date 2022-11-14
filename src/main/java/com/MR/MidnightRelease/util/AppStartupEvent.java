package com.MR.MidnightRelease.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {

    public AppStartupEvent(){}

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event){

    }
}
