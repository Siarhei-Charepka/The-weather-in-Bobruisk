package org.example;

public class Main {

    public static void main(String... args) throws Exception {
        Weather weatherInfo = new Weather();
        weatherInfo.getTemperatureInfo();
        weatherInfo.getWetInfo();

        Connector connect = new Connector();
        connect.getPing();

    }
}
