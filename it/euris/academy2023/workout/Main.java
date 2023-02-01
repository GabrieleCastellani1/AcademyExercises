package it.euris.academy2023.workout;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        WorkoutManager manager = new WorkoutManager();
        manager.load(new DataLoader() {
            @Override
            public List<String> load() {
                return WorkoutManager.readCsv("Workout.csv");
            }
        });
        manager.load("Workout.csv");
        manager.printLogs();
        manager.printStats();
    }
}
