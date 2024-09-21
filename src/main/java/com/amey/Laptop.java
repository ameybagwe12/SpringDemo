package com.amey;

import org.springframework.stereotype.Component;

@Component // NO NEED FOR ANY CONFIGURATIONS
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Object created laptop....");
    }
    public void compile() {
        System.out.println("Compile using laptop...");
    }
}
