import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {7, 8, 9},
            {1, 2, 3},
            {4, 5, 6}
        };
        int[] result = printDiagonal(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }



    public static int[] printDiagonal(int[][] mat) {
        
        if(mat == null || mat.length == 0){
            return new int[0];
        }

        int row = mat[0].length;
        int col = mat.length;
        int[] res = new int[row * col];
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for(int d = 0; d < row + col - 1; d++){
            list.clear();
            
            int r = d < row ? 0 : d - row + 1;
            int c = d < row ? d : row - 1;

            while(r < col && c > -1){
                list.add(mat[r][c]);
                ++r;
               --c;
            }
            if(d % 2 == 0) Collections.reverse(list);

            for(int i = 0; i < list.size(); i++){
                res[k++] = list.get(i);
            }
            
            
        }
        return res;
    }
}
