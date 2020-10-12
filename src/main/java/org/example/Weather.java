package org.example;

import org.example.util.WeatherInfo;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

public class Weather implements WeatherInfo {

    private String url = "https://weather.com/";
    public static String infoTemp;
    public static String infoWet;

    /**
     * This method get value of Temperature in Bobruisk from weather.com
     *
     * @throws IOException
     */

    @Override
    public String getTemperatureInfo() throws IOException {
        infoTemp = Jsoup.connect(url).get().selectFirst("span[data-testid=TemperatureValue]").text();
        System.out.println("Temperature in Bobruisk now: " + infoTemp);
        /**
         * The logger writes information about the work of the getTemperatureInfo method to the file logs.log
         */
        Logger logger = LoggerFactory.getLogger(Weather.class);
        logger.info("All is good! I working!");
        return infoTemp;
    }

    /**
     * This method get value of Wet in Bobruisk from weather.com
     *
     * @throws IOException
     */
    @Override
    public String getWetInfo() throws IOException {
        infoWet = Jsoup.connect(url).get().selectFirst("span[data-testid=PercentageValue]").text();
        System.out.println("Wet in Bobruisk now: " + infoWet);

        /**
         * The logger writes information about the work of the getWetInfo method to the file logs.log
         */
        Logger logger = LoggerFactory.getLogger(Weather.class);
        logger.info("All is good! I working!");

        return infoWet;
    }
}
