import java.util.*;
public class SubSetSumOne{
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        List<Integer> ans = subSet(arr,list);
        System.out.println(ans);
    }



    public static List<Integer> subSet(int[] arr,List<Integer> list){
        subSetSum(0, arr, 0, list);
        return list;
    }


    public static void subSetSum(int ind, int[] arr, int sum,List<Integer> list){

        if(ind == arr.length) {
        list.add(sum);
        return;
        }

        subSetSum(ind+1, arr, sum+arr[ind], list);
        subSetSum(ind+1, arr, sum, list);


    } 
}