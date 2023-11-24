import java.util.HashMap;
import java.util.Map;

public class SumTwoNumber {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i); //
        }
        return new int[0];
    }

    public int sum(int a, int b){
        return a+b;
    }
}
