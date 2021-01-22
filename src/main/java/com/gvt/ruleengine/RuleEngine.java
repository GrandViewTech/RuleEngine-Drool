package com.gvt.ruleengine;

import com.gvt.ruleengine.route.RuleRouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RuleEngine  implements CommandLineRunner
{


    public static void main(String[] args) throws Exception
    { SpringApplication.run(RuleEngine.class); }


    @Override
    public void run(String... args) throws Exception
    {
        CamelContext camelContext = new DefaultCamelContext();
        RuleRouteBuilder routeBuilder= new RuleRouteBuilder();
        camelContext.addRoutes(routeBuilder);
        camelContext.start();
        System.out.println("You can press Ctrl+C anytime to shutdown application");
        Thread.currentThread().join();
    }
}
