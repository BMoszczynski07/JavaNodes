import Nodes.Node;
import Nodes.Nodes;

public class Main {
    public static void main(String[] args) {
//        Node nNonStatic = new Nodes().create(25);
//        Node nStatic = Nodes::create(25);
//        Node n4 = Nodes::create(25);

        Node n4 = Nodes.create(25);
        Node n5 = Nodes.create("Hello");
        Node n6 = Nodes.create(84);
        Node n7 = Nodes.create(true);

        Nodes.link(n4, n5);
    }
}