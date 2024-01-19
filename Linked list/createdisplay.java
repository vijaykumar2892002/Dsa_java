class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedDisplay{
    Node head;

    void printLinkedList() {
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}

public class createdisplay {
    public static void main(String[] args) {
        System.out.println("heloo");
        linkedDisplay l1=new linkedDisplay();
        //create the 4 node
        Node p1=new Node(10);
        Node p2=new Node(30);
        Node p3=new Node(40);
        Node p4=new Node(50);
        //link all node;
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;
        l1.head=p1;
        l1.printLinkedList();
    }
}
