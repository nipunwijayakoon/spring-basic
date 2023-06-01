package com.dev;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl implements Engine {
    public String showCapacity() {
        return "1000CC";
    }
}
