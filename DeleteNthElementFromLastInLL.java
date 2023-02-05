class LinkedList{
public static class Node {
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static Node head;
    public static int size;
    public static Node tail;
public static void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        tail=head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public static void deleteFromLast(int n){
    Node temp=head;
    int sz=0;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    Node temp2=head;
    for(int i=0;i<sz-n-1;i++){
        temp2=temp2.next;
    }
    //Node temp3=temp2;
    temp2.next=temp2.next.next;
}
public static void reverseList(int left,int right){
    Node head2=null,temp=head,temp2=head,temp3=head;
    while(temp.data!=left){

        temp=temp.next;
    }
    Node prev=null;
    Node current=temp;
    Node next;
    while(current.data!=right){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }   
    next=current.next;
    current.next=prev;
    prev=current;
    current=next;
    while(temp2.next.data!=left){
        temp2=temp2.next;        
    }
    
    temp2.next=prev;
    while(temp3.next!=null){
        temp3=temp3.next;
    }
    temp3.next=current;
     //head=prev;
    
}
public static void print(){
    Node temp=head;
    if(head==null){
        System.out.println("LL is empty ");
    }
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
}  
}
public class DeleteNthElementFromLastInLL {
   

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        for(int i=0;i<8;i++){
            ll.addFirst(i*10);
        }
        ll.print();

        ll.reverseList(60,10);
        System.out.println();
        //ll.deleteFromLast(5);
        ll.print();
    }
    
}
