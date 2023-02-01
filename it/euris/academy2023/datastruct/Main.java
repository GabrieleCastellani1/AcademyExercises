package it.euris.academy2023.datastruct;

import it.euris.academy2023.frazione.Frazione;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        list();

        stack();

        map();


    }

    private static void map() {
        HashMap<String, Frazione> map = new HashMap<>();

        map.put("primo", Frazione.newInstance("3/4"));
        map.put("secondo", Frazione.newInstance("5/8"));
        map.put("terzo", Frazione.newInstance("5/16"));

        if (map.containsKey("primo")) {
            Frazione f = map.get("primo");

        }

        HashMap<String, ArrayList<String>> bigMap = new HashMap<>();

        HashMap<String, HashMap<String, HashMap<String, String>>> strangeMap = new HashMap<>();
    }

    private static void stack() {
        // logica LIFO (last in first out)
        Stack<String> stack = new Stack<>();
        stack.add("first");
        stack.add("second");
        stack.add("third");
        stack.add("fourth");
        stack.add("fifth");

        while (!stack.empty()) {
            String elem = stack.pop();
            System.out.println(elem);
        }
    }

    private static void list() {
        // Lista basa tu implementazione di array
        List<String> list = new ArrayList<>();

        list.add("ciao");
        list.add("1");
        list.add("2");
        list.add(1, "ciao2");

        String o = list.get(0);

        System.out.println(list.size());

        boolean check = list.contains(1);

        list.clear();

        list.remove(o);
    }
}
