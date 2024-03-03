package linkedlistimplementation;

public class DLNode<T> {
    private DLNode<T> next, prev;
    private Object element;

    public DLNode(T element, DLNode<T> next, DLNode<T> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    // setters
    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(DLNode<T> next) {
        this.next = next;
    }

    public void setPrev(DLNode<T> prev) {
        this.prev = prev;
    }

    // getters
    public Object getElement() {
        return this.element;
    }

    public DLNode<T> getNext() {
        return this.next;
    }

    public DLNode<T> getPrev() {
        return this.prev;
    }
}
