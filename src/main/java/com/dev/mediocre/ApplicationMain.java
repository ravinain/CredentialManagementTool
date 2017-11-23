package com.dev.mediocre;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

/**
 * Created by Ravi Nain on 11/18/2017.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(ApplicationMain.class)
                .headless(false).run(args);
        /*EventQueue.invokeLater(() -> {
           // ApplicationMain ex = ctx.getBean(ApplicationMain.class);
           // ex.setVisible(true);
            System.out.println("Test");
        });*/
    }
}
