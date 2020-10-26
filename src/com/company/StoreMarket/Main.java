package com.company.StoreMarket;

public class Main {

    public static void main(String[] args) {

        /*
            По-надолу можете да видите как се правят калкулациите директно
            чрез card обектите, но също и чрез customer обектите.
            Не бях сигурен как ще е по-правилно затова съм го направил така.
         */
        BronzeCard myBronzeCard = new BronzeCard();

        SilverCard mySilverCard = new SilverCard();

        GoldCard myGoldCard = new GoldCard();


        myBronzeCard.calculateDiscount(0,150);
        System.out.println("\n");

        mySilverCard.calculateDiscount(600,850);
        System.out.println("\n");

        myGoldCard.calculateDiscount(1500,1300);
        System.out.println("\n");

        Customer bronzeCustomer = new Customer(new BronzeCard(),302);
        bronzeCustomer.makesAPurchase(150);
        System.out.println("\n");

        Customer silverCustomer = new Customer(new SilverCard(),350);
        silverCustomer.makesAPurchase(900);
        System.out.println("\n");

        Customer goldCustomer = new Customer(new GoldCard(),1200);
        goldCustomer.makesAPurchase(2000);

    }
}
