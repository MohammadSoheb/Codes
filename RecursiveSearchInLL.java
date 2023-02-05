import java.util.*;
class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helper(head.next, key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }
    public static void searchKey(int key){
        int index=helper(head,key);
        System.out.println(index);
    }

}
public class RecursiveSearchInLL {
    public static void main(String[] args) {
       LinkedList ll=new LinkedList();
       ll.addLast(0);
       ll.addLast(2);
       ll.addLast(6);
       ll.print();
       int key=6;
        ll.searchKey(key);
    }
    
}
