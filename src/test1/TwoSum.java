package test1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname TwoSum
 * @Description 两数之和
 * @Date 2019/9/16 11:03
 * @Created by bg239157
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(target < nums[i]){
                continue;
            }

            if(map.containsKey(nums[i])){
                result[0] = map.get(nums[i]);
                result[1] = i;
            }else{
                map.put(target - nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6};

        TwoSum twoSum = new TwoSum();
        int[] results = twoSum.twoSum(arrays, 3);

        for(int i : results){
            System.out.println(i);
        }
    }


}
