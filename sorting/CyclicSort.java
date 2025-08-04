package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        cycliSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void cycliSort(int[] arr){
        int i = 0; 
        while(i < arr.length){
            int ind = arr[i] - 1;
            if(arr[i] != arr[ind]) swap(arr,ind,i);
            else i++;
        }
    }

    public static void swap(int[] arr, int i,  int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
