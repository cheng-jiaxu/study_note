package com.aijk.demo;


public class GoldCard extends Card {
    public GoldCard(String cardId,String carOwnerName,String number,double balance){
        super(cardId,carOwnerName,number,balance);
    }
    @Override
    public void expenditure(double balance)
    {
        System.out.println("Current purchase: "+balance);
        System.out.println("Price after discount(GoldCard): "+balance * 0.8);
        //update Gold Card account balance
        setBalance(getBalance()- 0.8 * balance);
        if(balance>=200){
            printTicket();
        }
        if(getBalance()<balance*0.8){
            System.out.println("your balance is insufficient");
            return;
        }
        if(getBalance()==0){
            System.out.println("your balance is empty.");
        }

    }
    //Spend over 200 and receive a free printed car wash ticket
    public void printTicket(){
        System.out.println("printed car wash ticket");
    }
}
