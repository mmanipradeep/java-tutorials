package com.javadesign;

public class SuperMarketOffer implements Offer{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.visitSuperMarketOffer(this);
    }
}
