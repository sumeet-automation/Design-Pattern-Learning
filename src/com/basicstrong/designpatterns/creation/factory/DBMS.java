package com.basicstrong.designpatterns.creation.factory;

public class DBMS implements Database{
    @Override
    public String connect() {
        return "Successfully connected to DBMS.";
    }
}
