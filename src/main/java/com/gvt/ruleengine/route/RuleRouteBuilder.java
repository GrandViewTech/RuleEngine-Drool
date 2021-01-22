package com.gvt.ruleengine.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
@Service
public class RuleRouteBuilder extends RouteBuilder
{
    @Override
    public void configure() throws Exception
    {
        String fileName="TestFile.txt";
        String fromUri="stream:file?fileName=input"+File.separator+fileName+"&scanStream=true&scanStreamDelay=1000";
        from(fromUri)
               //.log(LoggingLevel.INFO,"${body}")
                .process(exchange ->
                {
                    String message=(String)exchange.getIn().getBody();
                    System.out.println(message);
                });
    }
}
