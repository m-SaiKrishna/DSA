import java.util.*;

public class IsSubset {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 10, 4};
        int targetSum = 8;
        int n = arr.length;
        List<Integer> list = issubset(0, arr, n, 0, targetSum, new ArrayList<>());
        System.out.println(list);
    }

    public static List<Integer> issubset(int ind, int[] arr, int n, int sum, int targetSum, List<Integer> list) {
        if (ind == n) {
            if (sum == targetSum) {
                return list; 
            }
            return null;
        }

       
        if (sum + arr[ind] <= targetSum) {
            sum += arr[ind];
            list.add(arr[ind]);
            List<Integer> withCurrent = issubset(ind + 1, arr, n, sum, targetSum, list);
            if (withCurrent != null) {
                return withCurrent;
            }
            sum -= arr[ind];
            list.remove(list.size() - 1); 
        }

     
        return issubset(ind + 1, arr, n, sum, targetSum, list);
    }
}
