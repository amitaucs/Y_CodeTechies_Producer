package com.codetechies.codetechiesproducer.messageGateway;


import com.codetechies.codetechiesproducer.event.BankEvent;
import com.codetechies.codetechiesproducer.service.PublishMessageService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Slf4j
@AllArgsConstructor
@Configuration
public class BankPublisher {

    private PublishMessageService publishMessageService;

    @Bean
    public Supplier<BankEvent> publishNewCreditCardEvent(){

        return () -> {
            var event = publishMessageService.publishEvent();
            return event;
        };
    }
}
