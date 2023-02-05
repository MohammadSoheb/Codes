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
        Node head2=null;
        
        if(data==40){
            newNode.next=head;
            head=newNode;
             head2=head;
            return;
        }
        if(data==70){
            newNode.next=head;
            head=newNode;
            tail.next=head2;
            return;
        }
        size++;
        if(head==null){
            tail=head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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
    public static void loopInLL(){
        Node slow=head;
        Node fast=head.next;
        
            while(fast!=null && fast.next!=null){
                if(slow==fast){
                System.out.println("Yes loop is there");
                return;
            }
            slow=slow.next;
            fast=fast.next.next;

        }
    }
    public static void loopRemove(){
        Node slow=head;
        Node fast=head.next;
        
            while(fast!=null && fast.next!=null){
                if(slow==fast){
                slow=head;
                System.out.println(slow.data);
                System.out.println(fast.data);
                Node prev=null;
                while(slow!=fast){
                    slow=slow.next;
                    prev=fast;
                    fast=fast.next;
                }
                prev.next=null;
                return;
            }
            slow=slow.next;
            fast=fast.next.next;

        }

    }
} 
    
public class DetermineLoopInLL {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        for(int i=0;i<8;i++){
            ll.addFirst(i*10);
        }
        //ll.print();
        ll.loopInLL();  
       // ll.loopRemove();  
        ll.print();    

        }
        
    
}

