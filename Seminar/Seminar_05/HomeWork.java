package Seminar.Seminar_05;

import java.util.ArrayList;

public class HomeWork {
    public static void main(String[] args) {
        Node root = new Node(1);

        Node n2 = new Node(2);
        Node n3 = new Node(3);

        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n11 = new Node(11);
        Node n20 = new Node(20);

        ArrayList<Node> tempArrayRoot = new ArrayList<Node>();
        tempArrayRoot.add(n2);
        tempArrayRoot.add(n3);
        root.son = tempArrayRoot;

        ArrayList<Node> tempArrayN2 = new ArrayList<Node>();
        tempArrayN2.add(n4);
        n2.son = tempArrayN2;

        ArrayList<Node> tempArrayN3 = new ArrayList<Node>();
        tempArrayN3.add(n5);
        tempArrayN3.add(n6);
        n3.son = tempArrayN3;

        ArrayList<Node> tempArrayN4 = new ArrayList<Node>();
        tempArrayN4.add(n7);
        tempArrayN4.add(n8);
        tempArrayN4.add(n9);
        n4.son = tempArrayN4;

        ArrayList<Node> tempArrayN6 = new ArrayList<Node>();
        tempArrayN6.add(n11);
        tempArrayN6.add(n20);
        n6.son = tempArrayN6;




        // 1 2 4 7 9 3 5 6 11 20
//        System.out.println(n4.left.value);
        preOrder(root, "");
    }

    static void preOrder(Node tree, String space) {
        if (tree != null)
            System.out.println(space + tree.value);
        else {
            System.out.println(space + "nil");
            return;
        }

        for (int i = 0; i < tree.son.size(); i++) {
            preOrder(tree.son.get(i), space + " ");
        }

    }

}

// nil
class Node {
    int value;


    ArrayList<Node> son = new ArrayList<Node>();
    public Node(int value) {
        this.value = value;
    }


}
