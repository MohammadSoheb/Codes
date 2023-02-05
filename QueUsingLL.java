class Quell{
    static class Node{
        int val;
        Node next;
        Node(int data){
            this.val=data;
            this.next=null;
        }
    }
    static Node head=null;
    static Node tail=null;
        static void add(int data){
            Node nn=new Node(data);
            if(head==null){
                head=tail=nn;
            }
            tail.next=nn;
           // System.out.println(tail.val);
            tail=nn;
    }
    static int remove(){
        if(head==null){
            System.out.println("Que is empty");
            return -1;
        }
        int result=head.val;
        head=head.next;
        return result;
    }
    static void printing(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    
    }
public class QueUsingLL {
    public static void main(String[] args) {
        Quell q=new Quell();
        q.add(0);
        q.add(77);
        q.add(99);
        q.printing();
        System.out.println();
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        //System.out.println();
        q.printing();
    }
    
}
