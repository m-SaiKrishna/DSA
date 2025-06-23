import java.util.*;

class MoveZeros{
    public static void main(String args[]){
        int[] arr = {1,0,2,0,0};
        optimal(arr);
        //System.out.println(Arrays.toString(ans));
    }

    // public static int[] bruteForce(int[] arr){
    
    //     int ans[] = new int[arr.length];
    //     int count0 = 0;
    //     int in = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] != 0){
    //         ans[in] = arr[i];
    //         in++;
    //         }
    //         else if(arr[i] == 0) count0++;
    //     }

    //     for(int i = in; i < ans.length; i++){
    //         ans[in] = 0;
    //     }
    //     return ans;
    // }

    public static void optimal(int[] arr){
        int p1 = 0, p2 = 0;
        while(p2 < arr.length){
            if(arr[p2] != 0){
                swap(p1,p2,arr);
                p1++;
            }
            p2++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
