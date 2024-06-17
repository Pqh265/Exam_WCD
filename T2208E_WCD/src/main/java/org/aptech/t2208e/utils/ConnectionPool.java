package org.aptech.t2208e.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static ConnectionPool instance;
    private List<Connection> connections;
    private static final int POOL_SIZE = 10;


    // db config
    private static final String DB_URL = "jdbc:mysql://localhost:3307/t2208e_sem4";
    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin@123";

    public static synchronized ConnectionPool getInstance(){
        if(instance == null){
            instance = new ConnectionPool();
        }
        return instance;
    }
    public  synchronized Connection getConnection(){
        if(connections.isEmpty()){
            return null;
        }
        return  connections.remove(connections.size() -1);
    }



    public ConnectionPool() {
        // init all connection follow poolsize
        connections = new ArrayList<>();
        for (int  i = 0 ; i < POOL_SIZE ; i ++){
            Connection newConnection = null;
            try {
                // before have connection  ,  driver class
                Class.forName(DRIVER_CLASS_NAME);
                newConnection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
                connections.add(newConnection);
            }catch (Exception ex){
                System.err.println("Exception : "+ex.getMessage());
            }
        }
    }
}
