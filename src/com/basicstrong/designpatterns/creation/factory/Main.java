package com.basicstrong.designpatterns.creation.factory;

public class Main {
    public static void main(String[] args) {
        Database rdbms = DatabaseFactory.getDatabaseType(DatabaseTypes.RDBMS);
        System.out.println(rdbms.connect());
    }
}
