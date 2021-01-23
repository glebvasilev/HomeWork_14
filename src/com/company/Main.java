package com.company;

import java.util.Hashtable;
import java.util.List;

interface Basket {

    void addProduct(String name, int quantity);
    Integer removeProduct(String name);
    void updateProductQuantity(String name, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String name);
}

class Shop implements Basket{
    /*
     *  Class serves to work with products
     */

    Hashtable<String, Integer> ht1;

    public Shop() {

        ht1 = new Hashtable<>(5);
        ht1.put("soap", 8);
        ht1.put("brush", 4);
        ht1.put("toothpaste", 17);
        ht1.put("towel", 5);
    }

    public int getProductQuantity(String name) {
        return ht1.get(name);
    }

    public Integer removeProduct(String name) {
        return ht1.remove(name);
    }

    public void clear() {
        ht1.clear();
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    public void addProduct(String name, int quantity) {
    }

    public void updateProductQuantity(String name, int quantity) {
    }
}

public class Main {

    public static void main (String args[]) {

        Shop s = new Shop();

        System.out.println("Get product quantity: " + s.getProductQuantity("soap"));
        System.out.println("Current basket: " + s.ht1);
        System.out.println("Remove product: " + s.removeProduct("soap"));
        System.out.println("Current basket without soap: " + s.ht1);
        s.ht1.put("comb", 1);
        System.out.println("Current basket with comb: " + s.ht1);
        System.out.println("Clear products ------- ");
        s.clear();
        System.out.println("Clear basket: " + s.ht1);
    }
}