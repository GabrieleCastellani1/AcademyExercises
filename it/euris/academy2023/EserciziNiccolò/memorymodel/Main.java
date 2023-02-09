package it.euris.academy2023.EserciziNiccolò.memorymodel;

public class Main {

    static IntPointer sThird;

    public static void main(String[] args) {
        m1();


    }

    private static void m1() {
        IntPointer i1 = new IntPointer();
        i1.setValue(10);
        IntPointer.setSharedValue(10);

        IntPointer i2 = new IntPointer();
        i2.setValue(20);
        IntPointer.setSharedValue(20);

        IntPointer i3 = new IntPointer();
        i3.setValue(30);
        IntPointer.setSharedValue(30);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);


        IntPointer x1 = new IntPointer(10);
        IntPointer x2 = new IntPointer(10);

        String s1 = "ciao";
        String s2 = "ciao";
        System.out.println(s1 == s2);

    }

}
