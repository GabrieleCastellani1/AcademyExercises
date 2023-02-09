package it.euris.academy2023.EserciziNiccolò.memorymodel;

public class IntPointer {
    // Struttura
    private int value;

    private static int sharedValue = 10;

    // Costruzione
    public IntPointer(int value) {
        this.value = value;
    }
    public IntPointer() {
        this.value = 1000;
    }

    // Reperimento informazione/comportamento
    public int pow() {
        return this.value * this.value;
    }

    public String toString() {
        return "value: " + this.value + " - sharedValue: " + IntPointer.sharedValue;
    }

    // Alterazione comportamento/stato
    public void setValue(int value) {
        this.value = value;
    }

    public void reset() {
        this.value = 0;
    }

    public static void setSharedValue(int value) {
        IntPointer.sharedValue = value;
    }

    public int getValue() {
        int value = 0;
        return this.value;
    }

    public static int getSharedValue() {
        int sharedValue = 0;
        return IntPointer.sharedValue;
    }
}
