// Problem: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Tags: Array, HashMap
// My approach:
// - Use a hashmap to store the num in each index
// - Check if difference between target and num exists in the map → solution found
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int[] returnArray = new int[2];
        for(int i =0; i<nums.length; i++){
            if(hm.containsKey(target-nums[i]) == true){
                returnArray[0] = hm.get(target-nums[i]);
                returnArray[1] = i;
                break;
            }
            hm.put(nums[i],i);
        }
        return returnArray;
    }
}
