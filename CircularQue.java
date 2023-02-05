import java.util.*;

    class QueueCreate{
        static int arr[];
        static int size;
        static int front;
        static int rear=-1;
        QueueCreate(int n){
            arr=new int[n];
            rear=-1;
            front=-1;
            size=n;
        }
        public static boolean isEmpty(){
            if(rear==-1 && front==-1){
                return true;
            }
            return false;
        }
        public static boolean isFull(){
            if(((rear+1)%size)==front){
                return true;
            }
            return false;
        }
        //add
        public static void add(int data){
            
            if(isFull()){
                System.out.println("Que is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            //front=(front+1)%size;
            if(isEmpty()){
                System.out.println("que is empty");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                 front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            
            return result;
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
    class CircularQue{
        public static void main(String[] args) {
            QueueCreate q=new QueueCreate(2);
            q.add(1);
            q.add(2);
            q.add(88);
            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.remove());
            System.out.println(q.peek());
            
            
        }
    }
