package com.codetechies.codetechiesproducer.event;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BankEvent {

    private String message;
}
