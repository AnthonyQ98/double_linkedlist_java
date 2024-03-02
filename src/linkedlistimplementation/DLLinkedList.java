package linkedlistimplementation;

public class DLLinkedList {
    // data members
    private DLNode head, last;
    private int size;
    private DLNode curr;

    // constructor
    public DLLinkedList() {
        head = null;
        last = null;
        size = 0;
        curr = null;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    private void setCurrent(int index) {
        curr = head;
        for(int i = 1; i<index; i++){
            curr = curr.getNext();
        }
    }

    public Object get(int index) {
        setCurrent(index);
        return curr;
    }


    public void remove(int index){
        if (size > 0) { // verify we have elements in the DL list
            if (index==1){
                // first item from the DL list is to be removed
                head = head.getNext();
                head.setPrev(null);
            } else if (index==size) {
                // last item in the DL list is to be removed
                last = last.getPrev();
                last.setNext(null);
            } else {
                // it is not last or first, it is somewhere in the middle.
                setCurrent(index);
                DLNode prev = curr.getPrev(); // create pointer variable to prev node of element to be removed
                DLNode next = curr.getNext(); // create pointer variable to next node of element to be removed.
                prev.setNext(next); // point the prev node to the next node
                next.setPrev(prev); // point the next node to the prev node, this effectively removes the pointers to our node to be removed.
            }
            size--;
        } else {
            System.out.println("There is no nodes in the DL List. Can't remove " + index + " index");
        }
    }

    public void add(int index, Object element) {
        if(size==0){
            // new list
            DLNode newNode = new DLNode(element, null, null);
            head = newNode;
            last = newNode;
        } else if(index == 1){
            // insert at head
            DLNode newNode = new DLNode(element, null, null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (index == size+1) {
            //last index
            DLNode newNode = new DLNode(element, null, null);
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        } else {
            // somewhere not at the beginning or end
            setCurrent(index);
            DLNode newNode = new DLNode(element, null, null);
            newNode.setNext(curr);
            DLNode prev = curr.getPrev();
            newNode.setPrev(prev);
            prev.setNext(newNode);
            curr.setPrev(newNode);
        }
        size++;
    }

    public void printList(){
        for (DLNode aNode = head; aNode != null; aNode = aNode.getNext()) {
            System.out.println(aNode.getElement());
        }
    }

    public void printListBackwards() {
        for (DLNode aNode = last; aNode != null; aNode = aNode.getPrev()){
            System.out.println(aNode.getElement());
        }
    }







}
