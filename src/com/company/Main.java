package com.company;

class Shop {
    /*
     *  Class serves to work with products
     */

    private String product;
    private int quantity;

    public Shop(String product, int quantity) {
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity(String product) {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return product + " " + quantity;
    }
}

public class Main {

    public static void main(String[] args) {

        Shop[] s = new Shop[4];
        s[0] = new Shop("soap", 8);
        s[1] = new Shop("brush", 4);
        s[2] = new Shop("toothpaste", 17);
        s[3] = new Shop("towel", 5);

        System.out.println("Get product Quantity: " + s[0].getQuantity("soap"));
        System.out.println("Get products: " + s[3]);

    }
}