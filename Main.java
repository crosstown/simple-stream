package com.crosstown;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

         List<Product> productList = new ArrayList<>();

         Product p1 = new Product(10, "Sweet Cookies", 10.22, 2);
         Product p2 = new Product(11, "Sourdough bread", 9.67, 4);
         Product p3 = new Product(14, "Orange jam", 3.25, 1);
         Product p4 = new Product(16, "Salty Ham", 23.12, 5);

         productList.add(p1);
         productList.add(p2);
         productList.add(p3);
         productList.add(p4);

         List<Product> prodGTFivedollars = new ArrayList<>();
         productList
                 .stream()
                 .filter(p -> p.getPrice() > 5.0)
                 .forEach(System.out::println);

    }
}
