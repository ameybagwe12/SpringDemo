package com.amey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component // TO HANDLE CLASS USING SPRING
public class Alien {
    @Value("30") // ANNOTATION FOR INJECTING VALUE
    private int age;

    @Autowired
    // LOWER CASE CLASS NAME AS BEAN NAME ELSE NAME IT IN COMPONENT("")
    // @Qualifier("laptop")
    private Computer computer;
    private int salary;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


//    public Laptop getLap() {
//        return lap;
//    }
//
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Alien(){
        System.out.println("Object created alien....");
    }

    // CONSTRUCTOR INJECTION CALL
    public Alien(int age){
        System.out.println("Parameterized alien constructor called");
        this.age = age;
    }

    // REFERENCE TO BEAN TAG SEQUENCING NAME PROP (NOT COMPULSORY)
//    @ConstructorProperties({"age", "lap"})
//    public Alien(int age, int salary,Laptop lap) {
//        System.out.println("Alien construct 2 params");
//        this.age = age;
//        this.lap = lap;
//    }

    public void code() {
        System.out.println("Coding....");
        System.out.println(age);
//        lap.compile();
        computer.compile();
    }
}
