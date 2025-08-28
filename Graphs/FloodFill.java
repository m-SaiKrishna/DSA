package Graphs;
import java.util.*;
public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;
        // int sr = 1, sc = 1, color = 2;
        image = floodFill(image, sr, sc, color);
        System.out.println(Arrays.deepToString(image));
    }

    
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        if(target != color){
            dfs(image,sr,sc,target,color);
        }
        return image;
    }

    public static void dfs(int[][] image, int i, int j, int target,int color){
        if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != target)
        return;
        image[i][j] = color;

        dfs(image,i+1,j,target,color);
        dfs(image,i-1,j,target,color);
        dfs(image,i,j+1,target,color);
        dfs(image,i,j-1,target,color);

       
    }

    
}

