package com.amey;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // USE PRIMARY ANNOTATION ELSE QUALIFIER BUT PREFERENCE TO LAPTOP
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop constructor created....");
    }
    public void compile() {
        System.out.println("Compile using desktop...");
    }
}
