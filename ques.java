import java.util.*;

    class QueueCreate{
        static int arr[];
        static int size;
        static int rear=-1;
        QueueCreate(int n){
            int arr[]=new int[n];
            rear=-1;
            size=n;
        }
        public static boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            return false;
        }
        //add
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Que is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(rear==-1){
                System.out.println("que is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            return front;
        }
        // peek()
        public static int peek(){
            if(isEmpty()){
                System.out.println("que is empty");
                return -1;
            }
            return arr[0];
        }
    }
    class queue1{
        public static void main(String[] args) {
            QueueCreate q=new QueueCreate(2);
            q.add(1);
            q.add(2);
            q.peek();
            
        }
    }
   
    

