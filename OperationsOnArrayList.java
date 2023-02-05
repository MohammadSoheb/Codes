import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OperationsOnArrayList {
    public static void maximumInArrayList(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println();
        System.out.println("the maximum element in arrayList is="+max);
    }
    public static void createMultiDimentionalArrayList(){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);

        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> current=mainList.get(i);
            for(int j=0;j<current.size();j++){
                System.out.print(" "+current.get(j));

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //adding the elements in O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //PRINTING THE WHOLE ARRAY LIST
        System.out.println(list);
        int element=list.get(1);
        //PRINTING THE SINGLE ELEMENT
        System.out.println("at index 1="+element);
        //SET NEW ELEMENT IN LIST
        list.set(3, 10);
        System.out.println(list);
        //remove the element 
        list.remove(1);
        //contains or not
        System.out.println(list.contains(10));
        System.out.println(list.contains(2));
        //SIZE OF ARRAY LIST
        System.out.println("arrayList size="+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
        //reverse print 
        System.out.println();
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(" "+list.get(i));
        }
        maximumInArrayList(list);
        Collections.sort(list);
        System.out.println("assending order sort="+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("the reverse order sort is="+list);
        //MULTI DIMENTIONAL ARRAY LIST
        createMultiDimentionalArrayList();



    }
    
}
