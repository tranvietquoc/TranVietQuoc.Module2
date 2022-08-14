package ss9_arraylist_linkedlist;

public class MyLinkedList<E> {
    private  Node<E> head;
    private  Node<E> tail;
    private  int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        add(data);
    }

    // Node
    private class Node<E> {
        private Node<E> next = null;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }


    // Thêm phần tử vào cuối mảng
    public void add(E data) {
        if (tail == null){
            head = new Node<E>(data);
            tail = head;
        }else{
            tail.next = new Node<E>(data);
            tail      = tail.next;
        }
        numNodes++;
    }

    // Thêm phần tử vào vị trí nhất định
    public void add(int index, E data) {
        if (index < 0)
            return;

        Node<E> temp = head;

        for(int i=0; i < index-1; i++) {
            if (temp == null || temp.next == null){
                add(null);
            }
            temp = temp.next;
        }
        Node<E> holder  = temp.next;

        temp.next = new Node<E>(data);
        temp.next.next = holder;

        if (index > numNodes-1){
            tail = temp.next;
        }
        numNodes++;
    }

    // Thêm phần tử vào đầu mảng
    public void addFirst(E data) {
        Node<E> temp = head;
        head = new Node<E>(data);
        head.next = temp;
        numNodes++;
    }

    // Thêm phần tử vào cuối mảng
    public void addLast(E data) {
        add(data);
    }

    // Xóa phần tử đã cho
    public E remove(E o) {
        Node<E> temp   = head;
        Node<E> parent = head;
        while(temp != null) {
            if (temp.getData() == o){
                temp = null;
                parent.next = null;
                if (temp.next != null){
                    parent.next = temp.next;
                    temp.next   = null;
                }
                numNodes--;
            }else{
                parent = temp;
                temp   = temp.next;
            }
        }
        return o;
    }

    // Xóa phần tử theo chỉ số
    public boolean remove(int index) {
        Node<E> temp = head;
        if (index == 0){
            head = head.next;
            temp.next = null;
        }else{
            Node<E> parent = head;
            for(int i=0; i < index; i++) {
                if (temp.next == null){
                    return false;
                }
                parent = temp;
                temp   = temp.next;
            }

            parent.next = null;
            if (temp.next != null){
                parent.next = temp.next;
                temp.next   = null;
            }
            numNodes--;
        }
        return true;
    }

    // trả về kích thước của mảng hiện tại
    public int size(){
        return numNodes;
    }

    // Nhân bản
    public MyLinkedList<E> clone(){
        MyLinkedList<E> myLinkedLists = new MyLinkedList<E>();
        Node<E> temp = head;
        while(temp != null) {
            myLinkedLists.add(temp.getData());
            temp = temp.next;
        }
        return myLinkedLists;
    }

    // contains
    public boolean contains(E e){
        Node<E> temp = head;
        while(temp != null) {
            if (temp.getData() == e)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // indexOf
    public int indexOf(E e){
        Node<E> temp = head;
        for(int i=0; i < numNodes; i++) {
            if (temp.next == null)
                return -1;

            if (temp.getData() == e)
                return i;

            temp = temp.next;
        }
        return -1;
    }

    // ensureCapacity
    public void ensureCapacity(int minCapacity){
    }

    public E get(int index){
        Node<E> temp = head;
        for(int i=0; i<index; i++) {
            if (temp.next != null) {
                temp = temp.next;
            }
        }
        return temp.getData();
    }

    public E getFist(){
        return head == null ? null : head.getData();
    }

    public E getLast(){
        return tail == null ? null : tail.getData();
    }

    public void clear(){
        Node<E> temp = head;
        while(temp != null) {
            Node<E> removeLink = temp;
            temp            = temp.next;
            removeLink.next = null;
        }
        head = null;
        tail = null;
    }

    //
    public void printList() {
        Node<E> temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
