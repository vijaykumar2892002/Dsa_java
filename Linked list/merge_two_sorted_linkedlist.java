import java.util.*;
class node{
    int data;
    node next;
    node(int data ){
      this.data=data;
      this.next=null;
    }
}
public class merge_two_sorted_linkedlist {

  public static  void add (int e,node head){
    
        node temp=new node(e);
        if(head==null){
            head=temp;
        }
        else{
            node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;

        }
    }
     public static void addall(int []arr,node head){
        
        for(int i=1;i<arr.length;i++){
          add(arr[i],head);
        }
     }

  public static  void printLinkedList(node head) {
        node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.err.println();
    }

    public static node reverse_a_single_linkedlist(node a,node b){
        node dummNode=new node(0);
        node tail=dummNode;
        while(a!=null && b!=null){
            if(a.data<=b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a!=null){
            tail.next=a;
        }
        else{
            tail.next=b;
        }
        return dummNode.next;

        
    }

    public static void main (String[] arg){
            int arr1[]={1,4,8};
            int arr2[]={3,6};
            node head1=new node(arr1[0]);
            node head2=new node(arr2[0]);
            addall(arr1,head1);
            printLinkedList(head1);
             addall(arr2,head2);
            printLinkedList(head2);
            node head=reverse_a_single_linkedlist(head1, head2);
            printLinkedList(head);
    }
}