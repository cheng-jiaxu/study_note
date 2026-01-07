package com.aijk.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String cardId;
    private String carOwnerName;
    private String number;
    private double balance;

    //deposit
    public void deposit(double balance){
        this.balance += balance;
    }
    public void expenditure(double balance){
        this.balance -= balance;
    }
}
