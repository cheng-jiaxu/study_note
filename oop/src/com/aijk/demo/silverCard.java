package com.aijk.demo;

import org.w3c.dom.ls.LSOutput;

public class silverCard extends Card{
    public silverCard(String cardId, String carOwnerName,String number, int balance) {
        super(cardId,carOwnerName,number,balance);
    }

    @Override
    public void expenditure(double balance){
        System.out.println("current purchase: "+balance);
        System.out.println("Price after discount(SilverCard): "+balance * 0.9);
        setBalance(getBalance() - 0.9 * balance);
        if(getBalance()<balance*0.9){
            System.out.println("your balance is insufficient");
            return;
        }
        if(getBalance()==0){
            System.out.println("your balance is empty.");
            return;
        }

    }
}
