package com.company.StoreMarket;

import java.util.Arrays;

public class GoldCard extends DiscountCard {

    public GoldCard(){
        this.discountRate = 2;
    }


    @Override
    public void calculateDiscount(int turnover, int valueOfPurchase) {

        try{
            double initialDiscountRate = discountRate + (turnover / 100);

            if(initialDiscountRate > 10){
                initialDiscountRate = 10;
            }

            setDiscountRate(initialDiscountRate);

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
