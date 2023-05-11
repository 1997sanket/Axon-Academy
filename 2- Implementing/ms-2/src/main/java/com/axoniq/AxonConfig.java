package com.axoniq;

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
