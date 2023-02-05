package queues;

public class QueueOperations {
    
    public class Queue{
        static int arr[];
        //static int size=n;
        static int front=1;
        static int size;
        static int rear=-1;
        Queue(int n){
            int arr[]=new int[n];
            size=n;
        }
    
    
    static void add(int data){
        if(rear==size){
            System.out.println("Que is Overflows");
        }
        arr[++rear]=data;
    }
    static void remove(){
        if(rear==0){
            System.out.println("Que is underflow");
        }
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
    }
}
    public static void main(String[] args) {
        //static int arr[n];
        System.out.println(88);
        QueueOperations q=new Queue(5);
        q.add(2);
        q.add(6);
        q.add(10);
        q.add(99);
        q.add(88);

    }
}
