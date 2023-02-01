package it.euris.academy2023.weather;

public class WeatherRecord {
    private String location;
    private String year;
    private float minTemp;
    private float maxTemp;

    public WeatherRecord() {
    }

    public WeatherRecord(String location, String year, float minTemp, float maxTemp) {
        this.location = location;
        this.year = year;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public String getLocation() {
        return location;
    }

    public String getYear() {
        return year;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public float getMaxTemp() {
        return maxTemp;
    }
}
