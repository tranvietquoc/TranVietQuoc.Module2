package ss9_arraylist_linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 8);
        ll.add(9, 6);
        ll.printList();

        System.out.println("get index 2: " + ll.get(2));
        System.out.println("get first: " + ll.getFist());
        System.out.println("get last: " + ll.getLast());


        ll.clear();
        System.out.println("begin clear");
        ll.printList();
        System.out.println("end clear");
    }
}

