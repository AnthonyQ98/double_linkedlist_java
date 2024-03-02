//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package linkedlistimplementation;

public class DLLApp {
    public static void main(String[] args) {
        // Create our DLL
        DLLinkedList dll = new DLLinkedList();
        System.out.println("Is our DL Linked List empty: " + dll.isEmpty());

        // add some stuff to the DLL - Brazilian jiu jitsu submission names in this case!
        dll.add(1, "Kimura");
        dll.add(2, "Arm-bar");
        dll.add(3, "Heel hook");
        dll.add(4, "Triangle");
        dll.add(5, "Americana");

        // print curr size
        System.out.println("Current size " + dll.size());

        // add more stuff to the DLL
        dll.add(6, "Estima-lock");
        dll.add(7, "Guillotine");

        // print all elements
        System.out.println("Printing all elements in the list..");
        dll.printList();

        // backwards print
        System.out.println("Printng all elements in the list backwards..");
        dll.printListBackwards();

        // removing nodes
        dll.remove(4);
        dll.remove(5);

        // final print
        System.out.println("Printing after removal..");
        dll.printList();
    }
}