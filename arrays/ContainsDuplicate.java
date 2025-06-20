// Problem: https: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Tags: Array, HashMap, Sorting
// My approach:
// - Use a hashset to store the nums in array nums[]
// - Check if a num is in the set, if it is return true else return false.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hset = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            if(hset.contains(nums[i]) == true){
                return true;
            }
            hset.add(nums[i]);
        }
        return false;
    }
}
