package it.euris.academy2023.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    private Utils() {}

    public static void swap(Object[] arrayData, int first, int second) {
        Object temp = arrayData[first];
        arrayData[first] = arrayData[second];
        arrayData[second] = temp;
    }

    public static List<String> readCsv(String filename) {
        List<String> res = new ArrayList<>();
        try {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)))) {
                while (reader.ready()) {
                    res.add(reader.readLine());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
