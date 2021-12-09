import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();


// Before Java 8
        for(Map.Entry<String, Product> entry : productsByName.entrySet()) {
            Product product =  entry.getValue();
            String key = entry.getKey();
            //do something with the key and value
        }


        // After Java 8
        productsByName.forEach( (k, pro) -> {
            System.out.println("Key: " + k + " Product:" + pro.getDescription());
            //do something with the key and value
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
      //  productsByName.forEach((k,v) -> { System.out.println(k+v);});

        Product chocolate = new Product("chocolate", "something sweet");
        Product bike2 = productsByName.containsKey("E-Bike")
                ? productsByName.get("E-Bike")
                : chocolate;
        Product defaultProduct2 = productsByName.containsKey("horse carriage")
                ? productsByName.get("horse carriage")
                : chocolate;


        Product defaultProduct = productsByName.getOrDefault("horse carriage", chocolate);
        Product bike = productsByName.getOrDefault("E-Bike", chocolate);

//-----------------------------------------------------------------------------------------------------------------
        productsByName.putIfAbsent("E-Bike", chocolate);
        //Prior to Java 8:

        if(productsByName.containsKey("E-Bike")) {
            productsByName.put("E-Bike", chocolate);
        }



        // Merge()

        Product eBike2 = new Product("E-Bike", "A bike with a battery");


        eBike2.getTags().add("sport");
        productsByName.merge("E-Bike", eBike2, Product::addTagsOfOtherProduct);


       // Prior to Java 8:

        if(productsByName.containsKey("E-Bike")) {
            productsByName.get("E-Bike").addTagsOfOtherProduct(eBike2);
        } else {
            productsByName.put("E-Bike", eBike2);
        }

//compute
        productsByName.compute("E-Bike", (k,v) -> {
            if(v != null) {
                return v.addTagsOfOtherProduct(eBike2);
            } else {
                return eBike2;
            }
        });
    }



}
