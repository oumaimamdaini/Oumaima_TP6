package org.example.Oumaima_TP6;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.Rsrtjaxrs;
@Configuration
public class MyConfig {
    @Bean
    ResourceConfig config(){

        ResourceConfig config1 =  new ResourceConfig();
        config1.register(Rsrtjaxrs.class);
        return  config1;
    }
}
