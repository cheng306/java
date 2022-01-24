import java.util.Arrays;
import java.util.Comparator;

public class Program {
  public static void main(String[] args){
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

    Arrays.sort(arr, (Integer a, Integer b)->{return b-a;});
   

    //compress(3, arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    
  }//End of main


    public static int compress(int a, int[] arr){
      if (arr[a] == a){
        return a;
      }
      return arr[a] = compress(arr[a], arr);
    }
  
  
  
}