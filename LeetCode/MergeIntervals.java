import java.util.*;
public class MergeIntervals{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};

        List<List<Integer>> ans = new ArrayList<>();
        for(int [] interval : arr){
            ans.add(Arrays.asList(interval[0],interval[1]));

        }

        List<List<Integer>> list = new ArrayList<>();
        list = mergeIntervals(ans);
        for(List<Integer> ele : list){
           System.out.print("["+ele.get(0)+" "+ele.get(1)+"]  ");
        }

    }

    // public static List<List<Integer>>  mergeIntervals(List<List<Integer>> list){
    //      int n = list.size();
    //      Collections.sort(list,(a,b)->a.get(0)-b.get(0));    
    //      List<List<Integer>> ans = new ArrayList<>();    
    //      for(int i=0;i<n;i++){
    //         int start = list.get(i).get(0);
    //         int end = list.get(i).get(1);
    //         if(!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)){
    //             continue;
    //         }
    //         for(int j = i + 1 ; j < n; j++){
    //             if(list.get(j).get(0) <= end){
    //                 end = Math.max(end,list.get(j).get(1));
    //             }
    //             else{
    //                 break;
    //             }
    //         }

    //         ans.add(Arrays.asList(start,end));
            
    //      }
    //      return ans;
    //  }



    public static List<List<Integer>> mergeIntervals(List<List<Integer>> list){
        int n = list.size();
        Collections.sort(list,(a,b)->a.get(0) - b.get(0));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int start = list.get(i).get(0);
            int end = list.get(i).get(1);

            if(!ans.isEmpty() &&  end <= ans.get(ans.size() - 1).get(1) ) continue;

            for(int j = i + 1 ; j < n; j++){
                if(list.get(j).get(0) <= end){
                    end = Math.max(end, list.get(j).get(1));
                }
                else break;
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;

    }
 }
        


                    


        
        













 

         

 
























