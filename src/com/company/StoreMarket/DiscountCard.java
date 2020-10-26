package com.company.StoreMarket;

public abstract class DiscountCard {

    public int turnover;
    public double discountRate;

    public abstract void calculateDiscount(int turnover, int valueOfPurchase);

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
