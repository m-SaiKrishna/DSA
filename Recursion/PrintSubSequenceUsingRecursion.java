import java.util.*;
public class PrintSubSequenceUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        List<Integer> list = new ArrayList<>();
        int sum = 2;
        printSubSequence(0, list, 0, sum, arr, arr.length);
        }

    public static void printSubSequence(int ind, List<Integer> list, int s , int sum ,int[] arr, int n){
        
        if(ind == n) {
            if(s == sum){
                for(int ele : list){
                    System.out.print(ele+" ");
                    

                }
                System.out.println();
                

            }
            return;
        }

        list.add(arr[ind]);
        s += arr[ind];
        printSubSequence(ind + 1, list, s, sum, arr, n);

        s -= arr[ind];
        list.remove(list.size() - 1);
        printSubSequence(ind + 1, list, s, sum, arr, n);
    }
    
}

