package com.amey.config;

import com.amey.Alien;
import com.amey.Computer;
import com.amey.Desktop;
import com.amey.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

// AppConfig FOR JAVA BASED CONFIGURATIONS AND NOT XML FILE
@Configuration // ANNOTATION FOR JAVA CONFIG
@ComponentScan("com.amey") // SCAN THE COMPONENTS TO AVOID CONFIGS
public class AppConfig {

    // MULTIPLE NAME
    // @Bean(name = {"desk", "desktop1"}) ANNOTATION FOR USING BEAN
//    @Bean
    // Scope - Singleton(BY DEFAULT), Prototype
    // @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }

//    @Bean
//    @Scope("prototype")
//     AUTOWIRED IS OPTIONAL
    // Qualifier(BeanName) SIMILAR TO REF ATTR IN XML
//    public Alien alien(@Qualifier("laptop") Computer computer) {
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComputer(computer);
//        return obj;
//    }

//    @Bean
//    @Primary // FIRST PREFERENCE
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
