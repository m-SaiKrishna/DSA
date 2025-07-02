import java.util.*;
class SortZerosOnesTwos{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
    sort(arr);

}
public static void sort(int[] arr){
    int low = 0 , mid = 0 , high = arr.length - 1;
    while(mid <= high){
        if(arr[mid] == 0){
            swap(low,mid,arr);
            low++;
            mid++;
        }
        else if(arr[mid] == 1) mid++;
        else {
            swap(mid,high,arr);
           // mid++;
            high--;
        }
    }


    

    for(int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");

}

    public static void swap(int i , int j , int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;
    }
}
