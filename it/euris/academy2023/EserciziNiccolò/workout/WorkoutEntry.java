package it.euris.academy2023.EserciziNiccolò.workout;

import java.time.LocalDate;
public class WorkoutEntry {
    private LocalDate data;
    private String name;
    private int ripetizioni;
    private int peso;

    public WorkoutEntry(LocalDate data, String name, int ripetizioni, int peso) {
        this.data = data;
        this.name = name;
        this.ripetizioni = ripetizioni;
        this.peso = peso;
    }

    public WorkoutEntry(){}

    @Override
    public String toString() {
        return "WorkoutEntry{" +
                "data=" + data +
                ", name='" + name + '\'' +
                ", ripetizioni=" + ripetizioni +
                ", peso=" + peso +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getRipetizioni() {
        return ripetizioni;
    }
}
