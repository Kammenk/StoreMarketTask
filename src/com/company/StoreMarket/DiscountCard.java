package com.company.StoreMarket;

public abstract class DiscountCard {

    public int turnover;
    public double discountRate;

    public abstract void calculateDiscount(int turnover, int valueOfPurchase);

    public void printResult(int valueOfPurchase,double discountRate,double discount,double total) {
        System.out.println("Purchase value: " + "$" + valueOfPurchase + "\n"
                + "Discount rate: " + discountRate + "%" + "\n"
                + "Discount: " + "$" + discount + "\n"
                + "Total: " + "$" + total
        );
    }

    public int getTurnOver() {
        return turnover;
    }

    public void setTurnOver(int turnOver) {
        this.turnover = turnOver;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
