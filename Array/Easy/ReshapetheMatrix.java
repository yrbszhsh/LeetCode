/**
 * 566
 */
import java.util.*;
public class ReshapetheMatrix {

    public ReshapetheMatrix () {
        
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null) {
            return null;
        }
        int cloumns = nums.length;
        int rows = nums[0].length;
        if(r * c != cloumns * rows) {
            return nums;
        }
        int[][] result = new int[r][c];
        for(int i = 0; i< r*c; i++) {
            result[i/c][i%c] = nums[i/rows][i%rows];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] result = 
        {
            {2, 1},
            {3, 4},
            {5, 6}
        };
        ReshapetheMatrix test = new ReshapetheMatrix();
        result = test.matrixReshape(result, 2, 3);
        System.out.println(result[0][0]);
        System.out.println(result[0][1]);
        System.out.println(result[0][2]);
    }
}