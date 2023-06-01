package com.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Bmw implements Vehicle{

      private Engine engine;

      @Value("${car.code}")
      private int code;

    public Bmw(Engine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return new Random().nextInt(250);
    }

    public String getCapacity() {
        return engine.showCapacity();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
