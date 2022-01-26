package com.javadesign;

public class DinningOffer implements Offer{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.visitDinningOffer(this);
    }
}
