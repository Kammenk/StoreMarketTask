package com.company.StoreMarket;

public class Customer {

    private DiscountCard discountCard;
    private int turnover;

    public Customer(){

    }

    public Customer(DiscountCard discountCard, int turnover){
        setDiscountCard(discountCard);
        this.turnover = turnover;
    }

    public void makesAPurchase(int valueOfPurchase){
        discountCard.calculateDiscount(turnover,valueOfPurchase);
    }

    public void setDiscountCard(DiscountCard discountCard){
        if(discountCard instanceof BronzeCard){
            this.discountCard = new BronzeCard();
        } else if (discountCard instanceof SilverCard){
            this.discountCard = new SilverCard();
        } else{
            this.discountCard = new GoldCard();
        }
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public int getTurnover() {
        return turnover;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }
}
