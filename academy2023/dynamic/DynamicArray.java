package it.euris.academy2023.dynamic;

import it.euris.academy2023.utils.Utils;

public class DynamicArray {

    // CAMPI
    private int currentSize;
    private OggettoOrdinabile[] arrayData;
    private int count;
    public static final int GROW_RATE = 2;


    public DynamicArray(int initialCapacity) {
        this.currentSize = initialCapacity;
        this.arrayData = new OggettoOrdinabile[this.currentSize];
        this.count = 0;
    }

    public void add(OggettoOrdinabile item) {
        if (count >= currentSize) {
            expand();
        }
        this.arrayData[count] = item;
        count = count + 1;
    }

    private void expand() {
        System.out.println("Increasing size from " + currentSize + " to " + (currentSize + GROW_RATE));
        currentSize = currentSize + GROW_RATE;
        OggettoOrdinabile[] temp = new OggettoOrdinabile[currentSize];
        for (int i = 0; i < this.arrayData.length; i++) {
            temp[i] = this.arrayData[i];
        }
        this.arrayData = temp;
    }

    public Object get(int index) {
        if (index >= count) {
            throw new RuntimeException("Dynamic array index out of bound");
        }
        return this.arrayData[index];
    }

    public String toString() {
        String values = "LISTA\n-------------";
        for (int i = 0; i < count; i++) {
            values = values + "\nPOS -> " + i + " | VALUE -> " + arrayData[i].toString();
        }

        return values;
    }



    public int size() {
        return this.count;
    }

    public boolean contains(Object o) {
        for (Object obj : arrayData) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        int n = count;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                OggettoOrdinabile first = arrayData[j];
                OggettoOrdinabile second = arrayData[j + 1];
                if (second.precede(first)) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int first, int second) {
        Utils.swap(arrayData, first, second);
    }
}
