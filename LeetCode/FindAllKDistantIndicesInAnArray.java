import java.util.*;
public class FindAllKDistantIndicesInAnArray {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = findKDistantIndices(arr,key,k);
        for(int ele : list) System.out.print(ele+" ");
    }

   
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>  keyList = keyListNum(nums,key);
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
             if(isDistint(i,keyList,k)){
                ans.add(i);
             }   
        }
        Collections.sort(ans);
        return ans;
    }

    public static boolean isDistint(int i , List<Integer> keyList, int k){
        for(int ele : keyList){
            if(Math.abs(i - ele) <= k) return true;
        }
        return false;
    }


    public static List<Integer> keyListNum(int[]nums,int key){
        List<Integer> keyList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == key) keyList.add(i);
        }
        return keyList;
    }



}
