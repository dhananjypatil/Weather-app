package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Weather;

public class WeatherAPI {

	private static final String API_KEY = "your real key ";
    public static Weather getWeather(String city) {

        Weather weather = new Weather();

        try {

            String urlString = "https://api.openweathermap.org/data/2.5/weather?q="
                    + city + "&appid=" + API_KEY + "&units=metric";

            URL url = new URL(urlString);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String input;
            StringBuilder response = new StringBuilder();

            while ((input = br.readLine()) != null) {
                response.append(input);
            }

            br.close();

            JSONObject json = new JSONObject(response.toString());

            weather.setCity(json.getString("name"));

            JSONArray arr = json.getJSONArray("weather");
            weather.setCondition(arr.getJSONObject(0).getString("main"));

            JSONObject main = json.getJSONObject("main");

            weather.setTemperature(main.getDouble("temp") + " °C");
            weather.setHumidity(main.getInt("humidity") + "%");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return weather;
    }
}