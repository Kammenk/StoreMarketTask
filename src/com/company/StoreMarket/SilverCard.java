package com.company.StoreMarket;

import java.util.Arrays;

public class SilverCard extends DiscountCard{

    public SilverCard(){
        this.discountRate = 2;
    }

    @Override
    public void calculateDiscount(int turnover, int valueOfPurchase) {

        try{

            if(turnover > 300){
                setDiscountRate(3.5);
            }
            double discount = Math.floor(valueOfPurchase*(discountRate/100.0f) * 100) / 100;
            double total = valueOfPurchase - discount;

            printResult(valueOfPurchase,discountRate,discount,total);

        } catch(Exception ex){
            System.out.println("Oops, something went wrong.");
            System.out.println("Exception: " + ex);
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }

    }
}
