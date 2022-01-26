package com.javadesign;

public class SilverCreditCardVisitor implements CreditCardVisitor{
    @Override
    public void visitDinningOffer(DinningOffer dinningOffer) {
        System.out.println("Dinner Offer enabled for Silver Credit Card Holders");
    }

    @Override
    public void visitSuperMarketOffer(SuperMarketOffer superMarketOffer) {
        System.out.println("SuperMarket Offer enabled for Silver Credit Card Holders");
    }

    @Override
    public void visitHotelOffer(HotelOffer hotelOffer) {
        System.out.println("No Hotel Offer for Silver Credit Card Holders");
    }

    @Override
    public void visitTravelOffer(TravelOffer travelOffer) {
        System.out.println("No Travel Offer for Silver Credit Card Holders");
    }
}
