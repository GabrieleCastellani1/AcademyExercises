package it.euris.academy2023.EserciziNiccolò.workout;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkoutManager {
    public List<WorkoutEntry> exercises;

    public List<WorkoutEntry> load(String csv){
        List<String> workouts = readCsv(csv);
        this.exercises = convert(workouts);
        return this.exercises;
    }

    public List<WorkoutEntry> load(DataLoader loader){
        List<String> workouts = loader.load();
        this.exercises = convert(workouts);
        return this.exercises;
    }

    private List<WorkoutEntry> convert(List<String> exercises){
        List<WorkoutEntry> workouts = new ArrayList<>();
        for (String exercise : exercises) {
            workouts.add(convert(exercise));
        }
        return workouts;
    }

    private WorkoutEntry convert(String exercise){
        String[] tokens = exercise.split(";");
        return new WorkoutEntry(LocalDate.parse(tokens[0], DateTimeFormatter.BASIC_ISO_DATE),
                tokens[1],
                Integer.parseInt(tokens[2]),
                Integer.parseInt(tokens[3]));
    }

    public void printLogs(){
        for (WorkoutEntry workout : exercises) {
            System.out.println(workout.toString());
        }
    }
    public WorkoutManager(){
        exercises = new ArrayList<>();
    }

    public WorkoutManager(List<WorkoutEntry> exercises) {
        this.exercises = exercises;
    }

    public void printStats(){
        Map<String, Integer> stats = findMaxStats(exercises);
        for (String key : stats.keySet()) {
            System.out.println(key + "=" + stats.get(key) + ", ");
        }
    }

    private Map<String, Integer> findMaxStats(List<WorkoutEntry> exercises){
        Map<String, Integer> stats = new HashMap<>();
        for (WorkoutEntry exercise : exercises) {
            compareAndAdd(stats, exercise);
        }
        return stats;
    }

    private void compareAndAdd(Map<String, Integer> stats, WorkoutEntry exercise){
        if(stats.containsKey(exercise.getName())){
            Integer el = stats.get(exercise.getName());
            if(el.compareTo(exercise.getRipetizioni()) < 0){
                stats.replace(exercise.getName(), exercise.getRipetizioni());
            }
        }else{
            stats.put(exercise.getName(), exercise.getRipetizioni());
        }
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
