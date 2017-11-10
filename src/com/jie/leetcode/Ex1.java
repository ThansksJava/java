package com.jie.leetcode;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/7
 * @Time 14:50
 */
public class Ex1 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int result[] = new int[2];
        for(int i = 0,flag = 0;i < length&&flag==0;i++)
        {
            if(nums[i]>=target) {
                continue;
            }
            for(int j = i+1;j < length&&flag==0;j++)
            {
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    flag = 1;
                }
            }
        }
        return result;
    }
}
