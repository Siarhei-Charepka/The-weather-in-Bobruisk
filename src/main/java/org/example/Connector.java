package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static org.example.Weather.infoTemp;
import static org.example.Weather.infoWet;

public class Connector {

    String t = infoTemp;
    String w = infoWet;

    /**
     * The method connects to the database "db1" mysql
     */
    public void getPing() {
        try {
            String url = "jdbc:mysql://localhost/db1?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "08071986";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                String sql = "INSERT INTO weather (temperature, wet) Values (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, t);
                preparedStatement.setString(2, w);

                int rows = preparedStatement.executeUpdate();
                System.out.println("Connection to DB1 succesfull!");
                System.out.printf("Added %d rows", rows);
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}

