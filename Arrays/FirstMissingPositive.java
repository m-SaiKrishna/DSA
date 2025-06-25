import java.util.*;
public class FirstMissingPositive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstMissingPostive(arr));
        
    }

    // public static int firstMissingPositive(int [] arr){
    //     int[] ele = minAndMax(arr);
    //     int min = ele[0];
    //     int max = ele[1];
    //     int element = 0;
    //     List<Integer> list = new ArrayList<>();
    //     for(int el : arr) list.add(el);
    //     for(int i = 1; i <= max; i++) 
    //     if(!list.contains(i)){
    //         element = i;
    //         break;
    //     }
    //     else{
    //         element = i + 1;
    //     }
    //     return element;
        // }
    // public static int[] minAndMax(int[] arr){
    //     int min = Integer.MAX_VALUE;
    //     int max = Integer.MIN_VALUE;
    //     int[] ele = new int[2];
    //     for(int i=0; i < arr.length; i++){
    //         if(arr[i] > max) max = arr[i]; 
    //         else if(arr[i] < min)  min  = arr[i];
    //     }
    //     ele[0] = min;
    //     ele[1] = max;
    //     return ele;
    // } 



    public static int firstMissingPostive(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        for(int i = 1 ; i <= arr.length; i++){
            if(!set.contains(i)) return i;
        }
        return arr.length+1;
    }

}


