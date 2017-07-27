/**
 * FindAllNumbersDisappearedinanArray
 */
public class FindAllNumbersDisappearedinanArray {

    public FindAllNumbersDisappearedinanArray () {
        
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int num = 1;
        for (int n : nums) {
            result.add(num++);
        }
        for (int n : nums) {
            if(result.contains(n)) {
                result.remove();
            }
        }
        return result;
    }
}