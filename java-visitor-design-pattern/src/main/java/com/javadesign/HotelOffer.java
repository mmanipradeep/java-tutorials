package com.javadesign;

public class HotelOffer implements Offer{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.visitHotelOffer(this);
    }
}
