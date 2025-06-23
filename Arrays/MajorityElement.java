import java.util.*;
public class MajorityElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        // int ele = majorityElement(arr);
        // System.out.println(ele);
         
        int ele = optimal(arr);
        System.out.println(ele);
    }

    // public static int mapApproach(int[] arr){
    //     int n = arr.length;
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i = 0 ; i < arr.length; i++){
    //         int val = map.getOrDefault(arr[i], 0);
    //         map.put(arr[i], val+1);
    //     }
    //      for(Map.Entry<Integer,Integer> ans : map.entrySet()){
    //         if(ans.getValue() > n/2){
    //                 return ans.getKey();
    //         }
    //      }
    //      return -1;
    // }


    public static int optimal(int[] arr){
        int n = arr.length;
        int cnt = 0, ele = 0;
        for(int i=0;i<arr.length;i++){
            if(cnt == 0){
                ele = arr[i];
                cnt = 1;
            }
            else if(arr[i] == ele) cnt++;
            else cnt--;
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(ele == arr[i]) count++;
        }
        if(count > n/2){
            return ele;
        }
        return -1;
    }

}



