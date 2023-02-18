package it.euris.academy2023.EserciziMichael.library;

import java.util.*;

public class Library<T> {
    private final Map<String, Map<String, T>> contents;

    public Library() {
        this.contents = new HashMap<>();
    }

    public void insert(T content, String type, String title) {
        Map<String, T> sameType = contents.get(type);
        if (sameType == null) {
            Map<String, T> typeContent = new HashMap<>();
            typeContent.put(title, content);
            contents.put(title, typeContent);
        } else {
            sameType.put(title, content);
        }
    }

    public int search(String content, String title) {
        Iterator<String> it = contents.get(content).keySet().iterator();
        int found = 0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(title)) {
                found += 1;
            }
        }
        return found;
    }
}
