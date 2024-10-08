import java.util.Arrays;

public class TwoSum {
 /*
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
* and you may not use the same element twice.

You can return the answer in any order.

            Example 1:

            Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
            Example 2:

            Input: nums = [3,2,4], target = 6
            Output: [1,2]
            Example 3:

            Input: nums = [3,3], target = 6
            Output: [0,1]
 */

    public static int[] twoSum(int[] nums, int target)
    {
        //initialize an integer array of length 2
        int[] newNum = new int[2];

        //iterate the nums array
        for (int i = 0; i < nums.length - 1; i++)
        {
            //iterate again to compare values in the array
            for (int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target){
                    newNum[0] = i;
                    newNum[1] = j;
                }
            }
        }
        return newNum;
    }

    public static void main(String[] args)
    {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println((Arrays.toString(twoSum(nums, target))));
    }
}
