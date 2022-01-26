package com.javadesign;

public interface CreditCardVisitor {
     void visitDinningOffer(DinningOffer dinningOffer);
     void visitSuperMarketOffer(SuperMarketOffer superMarketOffer);
     void visitHotelOffer(HotelOffer hotelOffer);
     void visitTravelOffer(TravelOffer travelOffer);
}
