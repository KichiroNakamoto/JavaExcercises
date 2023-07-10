/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int  diff = 0;
        int[] resultado = new int[2];

        for(int i = 0; i < nums.length; i++){
           diff = target - nums[i];
           for(int j = 0; j < nums.length; j++){
               if(diff - nums[j] == 0 && i != j ){
                   resultado[0] = i;
                   resultado[1] = j;
                   break;
               }
           }     
        }

    return resultado; 

    } 
}


//Solved