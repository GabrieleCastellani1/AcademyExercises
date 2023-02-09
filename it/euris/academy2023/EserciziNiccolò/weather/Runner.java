package it.euris.academy2023.EserciziNiccolò.weather;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> list = FileUtils.readCsv("weather-data.csv");

        Simulator simulator = new Simulator(list);

    }
}
