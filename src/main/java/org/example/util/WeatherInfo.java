package org.example.util;

import java.io.IOException;

public interface WeatherInfo {

  String getTemperatureInfo() throws IOException;
  String getWetInfo() throws IOException;
}
