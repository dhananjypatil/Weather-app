package model;

public class Weather {

    private String city;
    private String condition;
    private String temperature;
    private String humidity;

    // Empty constructor
    public Weather() {
    }

    // Parameterized constructor
    public Weather(String city, String condition,
                   String temperature, String humidity) {

        this.city = city;
        this.condition = condition;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}