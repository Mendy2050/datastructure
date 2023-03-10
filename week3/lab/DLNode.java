package Data_structure_NCI.week3.lab;

/**
 * @author Mendy
 * @create 2023-02-11 13:18
 */
public class DLNode<T> {

    T element;
    DLNode<T> previous;
    DLNode<T> successor;


    public DLNode(T el, DLNode<T> prev, DLNode<T> succ) {
        this.element = el;
        this.previous = prev;
        this.successor = succ;
    }

    public DLNode(T el) {
        this.element = el;
        this.previous = null;
        this.successor = null;
    }


    @Override
    public String toString() {
        return "DLNode{" + "element=" + element + "}";
    }
} // end of the DLNode class
