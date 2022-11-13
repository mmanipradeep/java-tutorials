class OptionalInt{
	
	private OptionalInt readExpirationAsInt(Milk milk){ 
				String expiration = milk.getExpiration();
  
  try {
    return Optional.of(Integer.parseInt(expiration));
  }
  catch(NumberFormatException e) {
    return OptionalInt.empty();
  }
  
  
  private static Optional<String> getHighlightedText(SearchHit hit) {
 return ofNullable(hit.getHighlightFields())
  .flatMap(fields -> ofNullable(fields.get(FIELD_NAME)))
  .flatMap(field -> ofNullable(field.getFragments()))
  .flatMap(fragments -> stream(fragments).findFirst())
  .map(Text::string);
}

jshell> Optional.of(1).flatMap(a -> calcAs(a).flatMap(b -> calcAs(b)))
$6 ==> Optional[3]
jshell> Optional.of(1).map(a -> calcAs(a).map(b -> calcAs(b)))
$7 ==> Optional[Optional[Optional[3]]]

//Optional is meant for return values. Not as object fields.
//Optional isn’t serializable so using in records makes no sense. Records are data carriers so we shouldn’t add unserializable optionals
//Using ofNullable and orElseThrow is pointless. You could do a simple null check instead.
//You could use Guava’s Optional instead. This optional is serializable compared to Java’s optional

public Optional<BigDecimal> getBillAmount(final String id) {
    return getBookAccount(id)
            .map(bookAccount -> {
                // do something and return BigDecimal
                return someBalance.get().setScale(2, RoundingMode.HALF_UP);
            })
            .orElseGet(() -> {
                 /*perform multiple actions related to the functional logic and then return a BigDecimal*/
                return someOptionalBigDecimal;
            });
}

public Optional<BigDecimal> getBillAmount(final String id) { // can be used after JAva 9
    
    return getBookAccount(id)
        .map(bookAccount -> {
            // do something and return BigDecimal
            return someBalance.get().setScale(2, RoundingMode.HALF_UP);
        })
        .or(() -> {
            /*perform multiple actions related to the functional logic and then return a BigDecimal*/
            return someOptionalBigDecimal;
        });
}

}
	
	
	
	