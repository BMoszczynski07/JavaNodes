package Nodes;

public class Node<T> {
    protected T instance;
    protected Node<T> next;

    protected Node(T instance) {
        this.instance = instance;
    }

    protected Node(T instance, Node<T> next) {
        this.instance = instance;
        this.next = next;
    }
}
