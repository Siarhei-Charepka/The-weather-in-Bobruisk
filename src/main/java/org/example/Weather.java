package org.example;

import org.example.util.WeatherInfo;
import org.jsoup.Jsoup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;

public class Weather implements WeatherInfo {

    /**
     * This method get value of Temperature and wet in Bobruisk from weather.com
     * @throws IOException
     */
    @Override
    public String getWeatherInfo() throws IOException {

        String url = "https://weather.com/";
        String infoTemp = Jsoup.connect(url).get().selectFirst("span[data-testid=TemperatureValue]").text();
        String infoWet = Jsoup.connect(url).get().selectFirst("span[data-testid=PercentageValue]").text();

        System.out.println("Temperature and wet in Bobruisk now = " + infoTemp + ", " + infoWet);

        /**
         * The logger writes information about the work of the getWeatherInfo method to the file logs.log
         */
        Logger logger = LoggerFactory.getLogger(Weather.class);
        logger.info("All is good! I working!");
        return infoTemp;
    }
}
