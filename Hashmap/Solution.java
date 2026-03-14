import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }

            if(map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}

public class Main {

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2,2,1,1,1,2,2};

        int result = obj.majorityElement(nums);

        System.out.println(result);
    }
}

