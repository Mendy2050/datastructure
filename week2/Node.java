package Data_structure_NCI.week2;

import java.util.LinkedList;

/**
 * @author Mendy
 * @create 2023-02-02 15:40
 */
public class Node<T> {
    //instance variables
    T element;
    Node<T> next;


    //Constructor
    //We need two constructors
    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    // The second constructor is needed when we don't have a Node to point to
    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    public Node() {
        this.element = element;
    }


    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(100);
        node.next = new Node<>(1001);
        System.out.println(node.next);  // Node{element=1001, next=null}
        System.out.println(node.next.next);  //null
    }
}


