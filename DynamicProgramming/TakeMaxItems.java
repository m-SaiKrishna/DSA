package DynamicProgramming;
import java.util.*;
public class TakeMaxItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,5,12,34};
        System.out.println(takeMaxItems(arr, 0, 9));


    }

    public static int takeMaxItems(int[] arr, int ind, int budget){
        if(ind == arr.length  || budget < arr[ind]) return 0;

        int take = 1 + takeMaxItems(arr, ind+1, budget - arr[ind]);

        int skip = takeMaxItems(arr, ind + 1, budget);
        return Math.max(take, skip);
    }

    //[3, 34, 4, 12, 5, 2], sum = 9
}
