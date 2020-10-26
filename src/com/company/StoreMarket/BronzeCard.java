package com.company.StoreMarket;

import java.util.Arrays;

public class BronzeCard extends DiscountCard {

    public BronzeCard(){

    }


    @Override
    public void calculateDiscount(int turnover, int valueOfPurchase) {

        try{

            if(turnover >= 100 && turnover <= 300){
                setDiscountRate(1);
            } else if( turnover > 300){
                setDiscountRate(2.5);
            }
            double discount = Math.floor(valueOfPurchase*(discountRate/100.0f) * 100) / 100;
            double total = valueOfPurchase - discount;


            System.out.println("Purchase value: " + "$" + valueOfPurchase + "\n"
                    + "Discount rate: " + discountRate + "%" + "\n"
                    + "Discount: " + "$" + discount + "\n"
                    + "Total: " + "$" + total
            );

        } catch(Exception ex){
            System.out.println("Oops, something went wrong.");
            System.out.println("Exception: " + ex);
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }


    }


}
