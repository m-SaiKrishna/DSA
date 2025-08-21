public class CountSubMatrices { 
public static void main(String[] args) {
  int[][] arr = {
    {1, 0, 1},
    {1, 1, 0},
    {1, 0, 1}
  };
  System.out.println(countSubmatricesWithAllOnes(arr));         

}


public static int countSubmatricesWithAllOnes(int[][] matrix) {
  int count = 0;
  int rows = matrix.length;
  int cols = matrix[0].length;

  // Create a 2D array to store the height of consecutive 1s
  int[][] height = new int[rows][cols];

  // Fill the height array
  for (int j = 0; j < cols; j++) {
    for (int i = 0; i < rows; i++) {
      if (matrix[i][j] == 1) {
        height[i][j] = (i == 0) ? 1 : height[i - 1][j] + 1;
      }
    }
  }

 
  for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
      int minHeight = Integer.MAX_VALUE;
      for (int k = j; k < cols; k++) {
        minHeight = Math.min(minHeight, height[i][k]);
        if (minHeight == 0) break;
        count += minHeight;
      }
    }
  }

  return count;
}

}
