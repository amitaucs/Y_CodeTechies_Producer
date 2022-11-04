package com.codetechies.codetechiesproducer.service;

import com.codetechies.codetechiesproducer.event.BankEvent;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Slf4j
@AllArgsConstructor
@Service
public class PublishMessageService {
    public BankEvent publishEvent() {

        return BankEvent.builder()
                .message("Code Techies Producer ->" + Instant.now())
                .build();
    }
}
