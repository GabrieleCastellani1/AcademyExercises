package it.euris.academy2023.weather;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulator {
    List<WeatherRecord> records;
    Map<String, List<Float>> recordsMap;

    public Simulator() {
        this.records = new ArrayList<>();
        this.recordsMap = new HashMap<>();
    }

    public Simulator(List<String> recordsString) {
        this();
        this.records = convert(recordsString);
    }

    public Simulator(String filename) {
        this();
        this.records = convert(FileUtils.readCsv(filename));
    }

    private List<WeatherRecord> convert(List<String> recordsString) {
        return null;
    }

    public void simulate() {

        mapValues();
        for(String key : recordsMap.keySet()){
            List<Float> values = recordsMap.get(key);

        }

    }

    // popolare recordsMap
    private void mapValues() {
        for (WeatherRecord record : records) {
            mapValue(record, "-T_MIN", record.getMinTemp());
            mapValue(record, "-T_MAX", record.getMaxTemp());
        }
    }

    private void mapValue(WeatherRecord record, String x, float value) {
        String keyMin = record.getLocation() + x;
        recordsMap.putIfAbsent(keyMin, new ArrayList<>());
        recordsMap.get(keyMin).add(value);
    }
}
