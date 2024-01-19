class Node {
    int data;
    Node prev;
    Node next;
    Node (int data){
    this.data=data;
    this.prev=null;
    this.next=null;
    }
}
/**
 * InnerdoublyLinkedList
 */
class InnerdoublyLinkedList {
    Node head;
    Node tail;

    void addfirst(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            head.prev=temp;
            temp.next=head;
            head=temp;
        }
    }

    void add(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.prev=tail;
            tail.next=temp;
            tail=temp;
        }
    }

    //delete first node from doubly linked list

    Node deletefirst(){
       if(head==null || head.next==null){
        return null;
       }
       else{
        Node curr=head;
        head=curr.next;
        curr.next=null;
        head.prev=null;
        return  curr;
       }
       
    }

    void  deletelast(){
       if(head==null || head.next==null){
        return ;
       }
       else{
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next.prev=null;
        curr.next=null;

       }
       
    }

void printDoubltLinkedList(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+ " ");
        curr=curr.next;
    }
    System.out.println();
}
}

class doublyLinkedList{
    public static void main(String[] args) {
     InnerdoublyLinkedList l1=new InnerdoublyLinkedList();
     l1.add(10);
     l1.add(45);
    l1.add(1);
     l1.addfirst(4);
     l1.printDoubltLinkedList();
     Node deletedNode=l1.deletefirst();
     System.out.println(deletedNode.data);
     l1.printDoubltLinkedList();
     l1.deletelast();
     l1.printDoubltLinkedList();
   

    }
}