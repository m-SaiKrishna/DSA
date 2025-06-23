import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]  = sc.nextInt();
        }
        removeDuplicatesFromSortedArray(arr);


    }

    public static void removeDuplicatesFromSortedArray(int[] arr){
        int j = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
            }

            

        }
        System.out.println(Arrays.toString(arr));
    }
}
