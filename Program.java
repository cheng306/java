import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Program {
  public static void main(String[] args){

    //use comparater
    Integer arr[] = new Integer[4];
    arr[0] = 0;
    arr[1] = 0;
    arr[2] = 1;
    arr[3] = 2;

    Arrays.sort(arr, new Comparator<Integer>(){
      public int compare(Integer a, Integer b){ 
        return b-a;
      }
    });

    
    int arr2d[][] = new int[2][2];

    Arrays.sort(arr2d, (int[] a, int[] b) ->{
        return a[0] - b[0];
      }
    ); 

    System.out.println(-6%10);
   

    //rever two linked list
    // ListNode a = l1;
    // ListNode b = l1.next;
    // a.next = null;
    
    // int l1Length = 1;
    // while(b!=null){
    //     ListNode tmp = b.next;
    //     b.next = a;
    //     a=b;
    //     b = tmp;
    //     l1Length++;
    // }
    // ListNode l1Reverse = a;

    LinkedList<HelperClass> list = new LinkedList();
    list.offer(new HelperClass());
    list.offer(null);
    list.offer(new HelperClass());
    list.offer(null);
    list.offer(new HelperClass());

    System.out.println(list.size());

    String[] strArr = " a  b ".split("\\s+");
    System.out.println(strArr.length);
    System.out.println(strArr[0]);
    System.out.println(strArr[1]);
    System.out.println(strArr[2]);


    

  



    
  }//End of main


  public static int compress(int a, int[] arr){
    if (arr[a] == a){
      return a;
    }
    return arr[a] = compress(arr[a], arr);
  }
  
  
  
}

class HelperClass{
  int a=1;
  String b;
}