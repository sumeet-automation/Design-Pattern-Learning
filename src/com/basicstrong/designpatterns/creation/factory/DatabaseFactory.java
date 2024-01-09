package com.basicstrong.designpatterns.creation.factory;

import javax.xml.crypto.Data;

public class DatabaseFactory {

    public static Database getDatabaseType(DatabaseTypes databaseTypes) {
        Database db = null;
        if(databaseTypes == DatabaseTypes.RDBMS)
            db = new RDBMS();
        else if(databaseTypes == DatabaseTypes.DBMS)
            db = new DBMS();
        return db;
    }
}


