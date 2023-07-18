package org.example;


public class Main {
    public static void main(String[] args) {
        double originalPrice = 100.0;
        double discountPercentage = 10.0;

        DiscountCalculator dc = new DiscountCalculator();
        double discountedPrice = dc.calculateDiscount(originalPrice, discountPercentage);

        System.out.println("Precio original: $" + originalPrice);
        System.out.println("Porcentaje de descuento: " + discountPercentage + "%");
        System.out.println("Precio con descuento: $" + discountedPrice);
    }
}