package com.javadesign;

public class GoldCreditCardVisitor implements CreditCardVisitor{
    @Override
    public void visitDinningOffer(DinningOffer dinningOffer) {
        System.out.println("Dinner Offer enabled for Gold Credit Card Holders");
    }

    @Override
    public void visitSuperMarketOffer(SuperMarketOffer superMarketOffer) {
        System.out.println("SuperMarket Offer enabled for Gold Credit Card Holders");
    }

    @Override
    public void visitHotelOffer(HotelOffer hotelOffer) {
        System.out.println("Hotel Offer enabled for Gold Credit Card Holders");
    }

    @Override
    public void visitTravelOffer(TravelOffer travelOffer) {
        System.out.println("No Travel Offer for Gold Credit Card Holders");
    }
}
