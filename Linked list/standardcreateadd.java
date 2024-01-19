////Add the node in first place
import java.util.*;
class node {
   int data;
   node next;

   node(int data) {
       this.data = data;
       this.next = null;
   }
}
class linked{
   node head;
    void add (int e){
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

    void add ( int index, int e) throws IndexOutOfBoundsException {
      
       try {
         node temp =new node(e);
        if(index==0){
            firstadd(e);
        }
        else{
            int count =0;
            node curr=this.head;
            while(count <index-1){
                curr=curr.next;
                count++;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
        
       } catch (NullPointerException a) {
        throw new  IndexOutOfBoundsException();
       }
    }

   void firstadd (int e){
       node temp=new node(e);
       if(head==null){
           head=temp;
       }
       else{
         temp.next=head;
         head=temp;
       }
   }
  
   void addall(int []arr){
      for(int element : arr){
        add(element);
      }
   }

   void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(head.next==null)
        head=null;
        else if(head.next!=null){
            node curr =head;
            head=head.next;
            curr.next=null;

        }
    }

   void removeLast(){
          node curr =head;
        if(head==null){
            System.out.println("List is empty");
        }
        else if(head.next==null)
        head=null;
        else if(head.next!=null){
            while(curr.next.next!=null) curr=curr.next;
            curr.next=null;

        }
    }

   void removeAtIndex(int index){
    if(index==0){
        head=head.next;
    }
    else{
        node curr=head;
        int count =0;
        while(count<index-1){
            curr=curr.next;
            count++;
        }
        curr.next=curr.next.next;
        
        
    }
    printLinkedList();
   }
   int  indexof (int element ){
    node curr=head;
    int count=0;
    while(curr!=null){
        if(curr.data==element) return count;
        curr=curr.next;
        count++;
    }
    return -1;
}

 int  lastIndexOf (int element ){
    node curr=head;
    int count=0;
    int ans=-1;
    while(curr!=null){
        if(curr.data==element) ans=count;
        curr=curr.next;
        count++;
    }
    return ans;
}
   void printLinkedList() {
       node curr = head;
       while(curr!=null){
           System.out.print(curr.data + " ");
           curr=curr.next;
       }
       System.err.println();
   }

   int size(){
    node curr=head;
    int count=0;
    while(curr!=null){
        count++;
        curr=curr.next;
    }
   return count;
   }


// reverse the linked list

void reverse(){
   node curr=head;
   node prev=null;
   node next=null;
   while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
   }
   head=prev;
   printLinkedList();
}


//Find the mid of singly linkedlist 

node mid_element(){
    System.out.println(head.data);
    node slowptr=head;
    node fastptr=head;
    while(fastptr!=null && fastptr.next!=null){
        slowptr=slowptr.next;
        fastptr=fastptr.next.next;
    }
    return slowptr;
}

//find the nth node  from the end side
int nth_node_from_end(int n){
    node mainNode=head;
    node curr=head;
    int count=0;
    while(count<n){
        curr=curr.next;
        count++;
    }
    while(curr!=null){
     mainNode=mainNode.next;
     curr=curr.next;
    }
    return mainNode.data;
}
//remove duplicate node from sorted linkedlist
void removeduplecatefromsort(){
    node curr=head;
    while(curr!=null && curr.next!=null){
        if(curr.data==curr.next.data){
            curr.next=curr.next.next;
            
        }
        else{
            curr=curr.next;
        }
    }
    printLinkedList();
}

//insert node into sorted linked listed
void insert_sort(int n){
    node temp=new node(n);
     node curr=head;
     if(temp.data<head.data){
        temp.next=head;
        head=temp;
     }
     else{
     while(curr!=null){
        if(curr.next.data<=temp.data){
            curr=curr.next;
        }
        else{
            temp.next=curr.next;
            curr.next=temp;
            curr=temp;
            break;
    
        }
     }
    }
printLinkedList();
}

//Find the loop in singly linked list

boolean loopdetect(){
    node fastNode=head;
    node slowNode=head;
    while(fastNode!=null && fastNode.next!=null){
        fastNode=fastNode.next.next;
        slowNode=slowNode.next;
        if(fastNode==slowNode){
            return true;
        }
    }
    return false;
}
//Find the starting point of loop in singly linked list
node startpointofloop(){
    node fastNode=head;
    node slowNode=head;
    while(fastNode!=null && fastNode.next!=null){
        fastNode=fastNode.next.next;
        slowNode=slowNode.next;
        if(fastNode==slowNode){
            return getstartingpoint(slowNode);
        }
    }
    return null;    
    
}
node getstartingpoint(node slowNode){
    node temp=head;
    while(temp!=slowNode){
        temp=temp.next;
        slowNode=slowNode.next;
    }
    return temp;
}


//Merge two sort linked list in ascending order




}
public class standardcreateadd {
   public static void main(String[] args) {
       linked l1=new linked();
       l1.add(1);
       l1.add(1);
       l1.add(2);
       l1.add(2);
        l1.add(3);
        l1.add(6);
       l1.firstadd(1);
  
    //    int arr[]={123,32,};
    //    l1.addall(arr);
    //    int findindex=l1.indexof(4);
    //    int findindexatlast=l1.lastIndexOf(2);
    //    l1.printLinkedList();
    //     System.out.println(findindex);
    //     System.out.println(findindexatlast);
    //     int size=l1.size();
    //     System.out.println(size);
    
       
       l1.printLinkedList();
    //    l1.reverse();
       node midNode=l1.mid_element();
       System.out.println(midNode.data);
       System.out.println(l1.nth_node_from_end(2));
       l1.removeduplecatefromsort();
       l1.insert_sort(5);
       l1.insert_sort(1);
       l1.insert_sort(0);
       l1.removeAtIndex(2);
    //    l1.removeFirst();
    //    l1.printLinkedList();
    //    l1.removeLast();
    //    l1.printLinkedList();




   }
}
