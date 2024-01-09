package com.basicstrong.designpatterns.creation.factory;

public class RDBMS implements Database{

    @Override
    public String connect() {
        return "Successfully connected to RDBMS.";
    }
}
