import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

class LinkedList {
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
    public static void addLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;
    }
    public static void addAtPosition(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newnoNode=new Node(data);
        Node temp=head;
        size++;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node temp1=temp.next;
        temp.next=newnoNode;
        newnoNode.next=temp1;
    }
    //REMOVE 
    public static int removeAtFirst(){
        if(head==null){
            return Integer.MAX_VALUE;
        }
        int val=head.data;
        head=head.next;
        return val;
    } 
    public static int removeAtLast(){
        if(tail==null){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        int val=tail.data;
        temp.next=null;
        tail=temp;
        return val;
        
    }
    public static void reverseLL(){
        Node prev=null;
        Node current=tail=head;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
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
    public static Node slowFast(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;


    }
    public static boolean palindromeOrNot(){
        //1 FIND MID NODE BY SLOW FAST APROACH
      
        Node mid=slowFast();
    
        //2 REVERSE THE SECOND HALF
       
        Node prev=null;
        Node current=mid;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        Node right=prev;
        Node left=head;

        //3 CHECK FIRST HALF==SECOND HALF
        while(right != null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }  
        
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(20);
        ll.addFirst(10);
        //ll.addLast(20);
        //ll.addLast(10);
        ll.print();
       /*  System.out.println();
        //ADDING AT POSITION 
        int index=3;
        ll.addAtPosition(index,0);
        ll.print();
        ll.removeAtFirst();
        System.out.println();
        System.out.println("after remove first element");
        ll.print();
        ll.removeAtLast();
        System.out.println();
        System.out.println("after remove last element");
        ll.print();
        System.out.println("reverse of LL");
        ll.reverseLL();
        ll.print(); */
        boolean a=ll.palindromeOrNot();
        System.out.println(a);


    }
}
    

