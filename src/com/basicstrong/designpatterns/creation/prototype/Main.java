package com.basicstrong.designpatterns.creation.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CoffeeShop cs = new CoffeeShop();
        cs.setShopName("CCD");
        cs.loadStock();
        System.out.println(cs);

        CoffeeShop cs2 = cs.clone();;
        cs2.setShopName("CCD London");
        System.out.println(cs2);
        cs.getCoffeeTypes().remove(0);
        System.out.println("Removing the first coffee");
        //This is problematic as it is shallow cloning
        System.out.println(cs);
        System.out.println(cs2);

        System.out.println("********************");
        CoffeeShopClonable cs3 = new CoffeeShopClonable();
        cs3.setShopName("CCD INDIA");
        cs3.loadStock();
        System.out.println(cs3);

        CoffeeShop cs4 = cs3.clone();;
        cs4.setShopName("CCD London 2");
        System.out.println(cs4);
        cs3.getCoffeeTypes().remove(0);
        System.out.println("Removing the first coffee");
        //This is NOT problematic as it is deep cloning
        System.out.println(cs3);
        System.out.println(cs4);
    }
}
