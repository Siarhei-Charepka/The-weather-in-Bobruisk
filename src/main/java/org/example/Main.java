package org.example;

import java.io.IOException;
import java.sql.*;

public class Main {

    public static void main(String... args) throws Exception {
        Weather weatherInfo = new Weather();
        weatherInfo.getWeatherInfo();

        Connector connect = new Connector();
        connect.getPing();

    }
}
