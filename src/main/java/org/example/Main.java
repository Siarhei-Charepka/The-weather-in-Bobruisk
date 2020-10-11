package org.example;

import java.io.IOException;
import java.sql.*;

public class Main {

    public static void main(String... args) throws Exception {
        Weather weatherInfo = new Weather();
        weatherInfo.getWeatherInfo();

        try {
            String url = "jdbc:mysql://localhost/db1?serverTimezone=Europe/Moscow&useSSL=false";
            String username = "root";
            String password = "08071986";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connection to DB1 succesfull!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");

            System.out.println(ex);
        }


//    проверка на соединение с бд
//java -classpath c:\Java\mysql-connector-java-8.0.11.jar;c:\Java Program
//    try {
//      Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//      System.out.println("Connection succesfull!");
//    } catch (Exception ex) {
//      System.out.println("Connection failed...");
//
//      System.out.println(ex);
//    }
    }
}
