package it.euris.academy2023.dynamic;

class SimpleNode {
    public Object data;
    public SimpleNode next;

    public SimpleNode(Object data) {
        this.data = data;
        this.next = null;
    }
}