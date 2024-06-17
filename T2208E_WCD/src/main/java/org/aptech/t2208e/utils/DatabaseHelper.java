package org.aptech.t2208e.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHelper {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/t2208e_sem4";
    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin@123";
    private static Connection connnection; // singleton
    // fixme :  2. init connection every query -> singleton design pattern
    public static synchronized Connection getConnection(){
        if(connnection == null){
            init();
        }
        return connnection;
    }



    public static void init(){
        // return connection to db
        Connection newConnection = null;
        try {
            // before have connection  ,  driver class
            Class.forName(DRIVER_CLASS_NAME);
            newConnection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
            if(newConnection != null){
                System.out.println("Connection successfull ! " );
            }else {
                System.err.println("Connection failed ! " );
            }
        }catch (Exception ex){
            System.err.println("Exception : "+ex.getMessage());
        }
        connnection = newConnection;
    }
}
