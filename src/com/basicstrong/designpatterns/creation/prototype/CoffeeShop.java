package com.basicstrong.designpatterns.creation.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CoffeeShop implements Cloneable {
    String shopName;
    List<Coffee> coffeeTypes = new ArrayList<>();

    @Override
    protected CoffeeShop clone() throws CloneNotSupportedException {
        return (CoffeeShop) super.clone();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Coffee> getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(List<Coffee> coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    public void loadStock() {
        coffeeTypes = IntStream.range(0, 2).mapToObj(i -> {
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return new Coffee(i, "Coffee Special " + (i + 1));
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CoffeeShop{" +
               "shopName='" + shopName + '\'' +
               ", coffeeTypes=" + coffeeTypes +
               '}';
    }
}
