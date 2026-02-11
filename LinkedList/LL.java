package LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    LL() {
        this.size = 0;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst() {
        int value = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node SecondLastNode=getNode(size-2);
        int value=tail.val;
        tail=SecondLastNode;
        tail.next=null;
        return value;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

}
