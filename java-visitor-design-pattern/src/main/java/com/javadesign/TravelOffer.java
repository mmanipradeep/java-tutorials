package com.javadesign;

public class TravelOffer implements Offer {
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.visitTravelOffer(this);
    }
}
