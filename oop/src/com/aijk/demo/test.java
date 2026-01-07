package com.aijk.demo;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        //gas station payment
        //Define the card class to generate Gold/silver card object and warp owner details
        //make card a superclass
        //Define a Gold class that extends Card class
        //Apply for a gold card,create a gold card object and hand it over to an independent business unit(payment machine).
        GoldCard goldcard = new GoldCard("1","jack","010000000",5000);
        silverCard silverCard = new silverCard("2","rose","010000000",2000);
        Card c = new Card("3","lee","0100000003",230);
        pay(goldcard);
        pay(silverCard);
    }
    public static void pay(Card card){
        System.out.println("please swipe your card");
        System.out.println("enter consumption amount");
        Scanner sc = new Scanner(System.in);
        double expenditure = sc.nextDouble();
        card.expenditure(expenditure);



    }
}
