package com.java.streams;

import com.java.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    /**
     * Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes, interfaces and enum to allows functional-style operations on the elements. You can use stream by importing java.util.stream package.
     *
     * Stream provides following features:
     *
     * Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
     * Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
     * Stream is lazy and evaluates code only when required.
     * The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
     * You can use stream to filter, collect, print, and convert from one data structure to other etc. In the following examples, we have apply various operations with the help of stream.
     * @param args
     *
     *
     * Intermediate Operations :
     *
     * map(), filter(), distinct(), sorted(), limit(), skip()
     *
     * Terminal Operations :
     *
     * forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(),
     * allMatch(), noneMatch(), findFirst(), findAny()
     */

    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));


        List<Float> priceList = productsList.stream()
                .filter(p -> p.price>30000)
                .map(p-> p.price).collect(Collectors.toList());

        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));

        System.out.println(priceList);


        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));

        Product productA = productsList.stream()
                .max((product1, product2)->product1.price > product2.price ? 1: -1)
                .get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream()
                .min((product1, product2)->product1.price > product2.price ? 1: -1)
                .get();
        System.out.println(productB.price);

        long count = productsList.stream()
                .filter(product->product.price<30000)
                .count();
        System.out.println(count);
    }
}
