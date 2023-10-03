package Nodes;

public class Nodes<T> {
//    public Node<T1> create(T arg) {
//        return new Node<T>(arg);
//    }

    public static <T2> Node<T2> create(T2 arg) {
        return new Node<T2>(arg);
    }

    public static void link (Node firstNode, Node secondNode) {
        firstNode.next = secondNode;
    }
}
