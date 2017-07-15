import java.util.*;
/**
 * ArrayPartitionI
 */
public class ArrayPartitionI {

    public ArrayPartitionI () {
        
    }
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0 ; i<nums.length ; i += 2) {
            sum += nums[i];
        }        
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,2,7,432,243,543};
        ArrayPartitionI A = new ArrayPartitionI();
        int s = 0;
        s = A.arrayPairSum(nums);
        System.out.println(s);
    }
}