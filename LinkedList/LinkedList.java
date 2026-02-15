package LinkedList;

public class LinkedList {

    public Node head;
    public Node tail;

    private int size;

    public LinkedList(){
        this.size=0;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;

        if(tail== null){
            tail=head;
        }
         
        size++;
    }

    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node node =new Node(data);
        tail.next=node;
        tail=node;
        size++;
       
        
    }
    public void insert(int data,int index){
        if(index==0){
            insertFirst(data);
            return;
        }if(index==size){
            insertLast(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(data,temp.next);
        temp.next=node;
        size++;
    }

    public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int deleteFirst(){
        int val=head.data;
        if(head== null){
            tail=null;
        }
        head=head.next;
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node node=getNode(size-2);
        int val=tail.data;
        tail=node;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
          if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        Node prevNode=getNode(index-1);
        int value=prevNode.next.data;
        prevNode.next=prevNode.next.next;
        return value;
    } 
    public void display(){
        Node temp=head;
        while(temp != null){
             System.out.print(temp.data + " --> ");
             temp=temp.next;
        }
        System.out.println("END");
    }
    
}
