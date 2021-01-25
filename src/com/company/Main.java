package com.company;

import java.util.Collections;
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

    public List<String> getProducts() {
        List<String> li = Collections.list(ht1.keys());
        return li;
    }

    public void addProduct(String name, int quantity) {
        ht1.put(name, quantity);
    }

    public void updateProductQuantity(String name, int quantity) {
        ht1.replace(name, quantity);
    }
}

public class Main {

    public static void main (String args[]) {

        Shop s = new Shop();

        s.addProduct("soap", 8);
        s.addProduct("brush", 4);
        s.addProduct("toothpaste", 17);
        s.addProduct("towel", 5);

        System.out.println("Get product quantity: " + s.getProductQuantity("soap"));
        System.out.println("Current basket: " + s.getProducts());
        System.out.println("Remove product: " + s.removeProduct("soap"));
        System.out.println("Current basket without soap: " + s.getProducts());
        s.addProduct("comb", 1);
        System.out.println("Current basket with comb: " + s.getProducts());
        System.out.println("Get product comb quantity: " + s.getProductQuantity("comb"));
        s.updateProductQuantity("comb", 2);
        System.out.println("Current basket with new comb: " + s.getProducts());
        System.out.println("Get product comb quantity: " + s.getProductQuantity("comb"));
        System.out.println("Clear products ------- ");
        s.clear();
        System.out.println("Clear basket: " + s.getProducts());
    }
}