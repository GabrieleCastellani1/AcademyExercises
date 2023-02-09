package it.euris.academy2023.EserciziNiccolò.weather;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
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
