package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {

    /**
     * The method connects to the database "db1" mysql
     */
    public void getPing(){
        try {
            String url = "jdbc:mysql://localhost/db1?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "08071986";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                int rows = statement.executeUpdate("INSERT weather(temperature, wet) VALUES ('11', 99)");
                System.out.println("Connection to DB1 succesfull!");
                System.out.printf("Added %d rows", rows);

            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }


}

