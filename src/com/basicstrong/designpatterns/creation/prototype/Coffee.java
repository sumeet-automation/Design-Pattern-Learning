package com.basicstrong.designpatterns.creation.prototype;

public class Coffee {

    int coffeeId;
    String coffeName;

    @Override
    public String toString() {
        return "Coffee{" +
               "coffeeId=" + coffeeId +
               ", coffeName='" + coffeName + '\'' +
               '}';
    }

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getCoffeName() {
        return coffeName;
    }

    public void setCoffeName(String coffeName) {
        this.coffeName = coffeName;
    }

    public Coffee(int coffeeId, String coffeName) {
        this.coffeeId = coffeeId;
        this.coffeName = coffeName;
    }
}
