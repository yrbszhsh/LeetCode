/**
 * MaxConsecutiveOnes
 */
public class MaxConsecutiveOnes {

    public MaxConsecutiveOnes () {
        
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int size = nums.length;
        int max = 0;
        for(int i = 0; i<size; i++) {
            int count = 0;
            while(i<size && nums[i] == 1) {
                count++;
                i++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}