Map<String, Integer> aMap = new HashMap<>();
String a = “levis”;
String b = new String(“levis”);
aMap.put(a, 14);
aMap.put(b, 12);

aMap.get(“levis”);  -
aMap.get(new String(“levis”));  -
aMap.get(b); 
aMap.get(a); 
