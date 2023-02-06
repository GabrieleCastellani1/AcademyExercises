package it.euris.academy2023.Library;

import java.util.*;

public class Library<T extends Content> {
    private final Map<String, List<T>> contents;

    public Library() {
        this.contents = new HashMap<>();
    }

    public void insert(T content) {
        List<T> sameType = contents.get(content.getType());
        if (sameType == null) {
            ArrayList<T> typeContent = new ArrayList<>();
            typeContent.add(content);
            contents.put(content.getType(), typeContent);
        } else {
            sameType.add(content);
        }
    }

    public boolean search(String content, String title) {
        Iterator<T> it = contents.get(content).iterator();
        boolean found = false;
        while (it.hasNext()) {
            if (it.next().getTitle().equalsIgnoreCase(title)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
