package Data_structure_NCI.week2;

import java.util.LinkedList;

/**
 * @author Mendy
 * @create 2023-02-03 12:32
 */
public class SingleLinkedlist<T> {
    LinkedList<String> ll = new LinkedList<>();
    private Node<T> first;
    private Node<T> last;

    private Node<T> head;

    public SingleLinkedlist() {
        first = null;
        last = null;
    }


    //Test to see if the linkedlist is empty
    public boolean isEmpty() {
        return first == null;
    }


    //Calculate the number of elements in the linkedlist
    public int size() {
        int count = 0;
        Node<T> current = first;
        //we need a loop to keep moving through our linkedlist
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }


    /*This method is designed to produce a string representation of the elements
        withing the linkedList.*/

    @Override
    public String toString() {
        return "SingleLinkedlist{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }




    //method to add an element into the linkedlist
    public void add(T el) {
        if (isEmpty()) {
            //if its empty do something
            first = new Node<T>(el);
            last = first;
        } else {
            //there is something in the list we need to
            //add at the end of the list
            last.next = new Node<T>(el);
            last = last.next;
        }
    }




    /*This method adds an element to the list in the desired position*/

    public void addAtIndex(int index, T element) {
        if (index < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (currentIndex != index - 1) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        Node newNode = new Node(element);
        newNode.next = current.next;
        current.next = newNode;
    }





    /*This method removes an element from the list if present.*/
    public void removeElement(int target) {
        if (head == null) {
            return;
        }

        if (head.element.equals(target)){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !head.element.equals(target)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }




    /*This method is designed to check if an element is in the linkedList.*/
    public boolean contains(T target){
            Node<T> current = head;
            while (current != null) {
                if (current.element.equals(target)) {
                    return true;
                }
                current = current.next;
            }
            return false;
    }




    /* This method adds an element to the list in the position previous to the first occurrence of the the target element*/
    public void addBefore(T target, T element){
        if (head == null) {
            head = new Node<>(element);
            return;
        }

        if (head.element.equals(target)) {
            Node<T> newNode = new Node<>(element);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.element.equals(target)) {
            current = current.next;
        }

        if (current.next != null) {
            Node<T> newNode = new Node<>(element);
            newNode.next = current.next;
            current.next = newNode;
        }
    }



    /* This method adds an element to the list in the position after to the first occurrence of the the target element*/
    public void addAfter(T target, T element){
        if (head == null) {
            head = new Node<>(element);
            return;
        }

        Node<T> current = head;
        while (current != null && !current.element.equals(target)) {
            current = current.next;
        }

        if (current != null) {
            Node<T> newNode = new Node<>(element);
            newNode.next = current.next;
            current.next = newNode;
        }
    }






















    public static void main(String []args){
        SingleLinkedlist<String> linked = new SingleLinkedlist<>();
        linked.add("apple");
        linked.add("Orange");
        System.out.println("There are :: "+linked.size()+" items in the linkedlist");
    }



}
