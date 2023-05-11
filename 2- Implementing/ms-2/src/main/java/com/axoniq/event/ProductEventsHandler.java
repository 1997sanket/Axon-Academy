package com.axoniq.event;

//import com.eventdrivenmicroservices.productservice.command.api.data.entity.Product;
//import com.eventdrivenmicroservices.productservice.command.api.data.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class ProductEventsHandler {

    @PostConstruct
    public void onConstruct() {
        log.info("Event handler bean constructed");
    }

    //private ProductRepository productRepository;

//    public ProductEventsHandler(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public ProductEventsHandler() {

    }
    // This is our our event handler which will save the data in database using
    // repository layer

    @EventHandler(payloadType = ProductCreatedEvent.class)
    public void handle(ProductCreatedEvent productCreatedEvent) {
        log.info("In Product create event handler");
//        Product product = new Product();
//        BeanUtils.copyProperties(productCreatedEvent, product);
//        System.out.println("In Product create event handler");
//        productRepository.save(product);
    }

//    @EventHandler
//    public void on(ProductDeletedEvent productDeletedEvent) {
//
//        Product product = new Product();
//        BeanUtils.copyProperties(productDeletedEvent, product);
//
//        productRepository.delete(product);
//    }

}
