package ss9_arraylist_linkedlist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("List: ");
        listInteger.output();

        listInteger.add(3, 7);
        System.out.println("After add index: ");
        listInteger.output();

        listInteger.remove(1);
        System.out.println("After remove: ");
        listInteger.output();

        System.out.println("Have 5: " + listInteger.contain(5));
        System.out.println("Have 7: " + listInteger.contain(7));

        System.out.println("Index of 7: " + listInteger.indexOf(7));
        System.out.println("Index of 5: " + listInteger.indexOf(5));

        listInteger.clear();
        System.out.println("After Clear: ");
        listInteger.output();
    }
}
