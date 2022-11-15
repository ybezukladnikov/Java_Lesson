package Seminar.Seminar_05;

public class inClass {
    public static void main(String[] args) {
        Node n1 = new Node(1);

        Node n2 = new Node(2);
        Node n3 = new Node(3);
    }
}
class Node{
    int value;
    public Node(int value){
        this.value = value;
    }
    Node left;
    Node right;
}
