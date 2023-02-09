package it.euris.academy2023.EserciziNiccolò.dynamic;

public class SimpleLinkedList {
    private SimpleNode root;
    private int counter;

    public SimpleLinkedList() {

    }

    public void add(Object o) {
        SimpleNode node = new SimpleNode(o);

        if (this.root == null) {
            this.root = node;
        } else {
            SimpleNode last = root;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }

        counter++;
    }

    public Object peek() {
        int index = 0;
        SimpleNode current = root;
        while (index++ < counter - 1) {
            current = current.next;
        }
        return current.data;
    }

    public Object pop() {
        int index = 0;
        SimpleNode current = root;
        while (index++ < counter - 2) {
            current = current.next;
        }
        SimpleNode last = current.next;
        current.next = null;
        counter--;
        return last.data;
    }

    public Object get(int index) {
        if (index >= counter) {
            throw new RuntimeException("L'elemento alla posizione " + index + " non esiste, dimensione attuale " + counter);
        }
        int count = 0;
        SimpleNode current = this.root;
        while (count < index) {
            current = current.next;
            count++;
        }
        return current.data;
    }

    @Override
    public String toString() {
        String listContent = "-------------------------";
        SimpleNode current = this.root;
        while (current != null) {
            listContent += "\n" + current.data;
            current = current.next;
        }
        listContent += "\n-------------------------";
        return listContent;
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add("primo");
        list.add("secondo");
        list.add("terzo");
        list.add("quarto");
        list.add("quinto");



        System.out.println(list);

        //System.out.println(list.get(10));
        System.out.println(list.pop());

        System.out.println(list);


       // HTMLRenderer renderer = new HTMLRenderer(List<String> csv, List<String> colors);
//
       // System.out.println(renderer.render());
    }
}
