package linkedlistimplementation;

public class DLNode {
    private DLNode next, prev;
    private Object element;

    public DLNode(Object element, DLNode next, DLNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    // setters
    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public void setPrev(DLNode prev) {
        this.prev = prev;
    }

    // getters
    public Object getElement() {
        return this.element;
    }

    public DLNode getNext() {
        return this.next;
    }

    public DLNode getPrev() {
        return this.prev;
    }
}
