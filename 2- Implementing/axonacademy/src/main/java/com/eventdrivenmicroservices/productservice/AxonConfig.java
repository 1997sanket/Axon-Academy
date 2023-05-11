package com.eventdrivenmicroservices.productservice;

import com.eventdrivenmicroservices.productservice.command.api.aggregate.ProductAggregate;
import com.eventdrivenmicroservices.productservice.command.api.event.ProductEventsHandler;
import com.thoughtworks.xstream.XStream;
import org.axonframework.config.Configurer;
import org.axonframework.config.DefaultConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    // This ensures the XStream instance used is allowed to de-/serializer this demo's classes
//    @Bean
//    public XStream xStream() {
//        XStream xStream = new XStream();
//        xStream.allowTypesByWildcard(new String[]{"com.eventdrivenmicroservices.productservice.**"});
//        return xStream;
//    }
//
//    Configurer configurer =
//            DefaultConfigurer.defaultConfiguration()
//                    .configureAggregate(ProductAggregate.class)
//                    .registerEventHandler(config-> new ProductEventsHandler());

}
