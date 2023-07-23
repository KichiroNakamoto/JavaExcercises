
/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/

class Solution {
    public int searchInsert(int[] nums, int target) {

        boolean state = true;
        int value = 0;

        for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    value = i;
                    state = false;
                    break;
                }
            }

        if(state){

                if(nums[nums.length - 1] > target){
                    for(int j = 0; j < nums.length - 1; j++){
                        if(nums[j] < target && nums[j + 1] > target){
                            value = j + 1;
                        }

                    }
                } else {
                    value = nums.length;
                }
                

        } 
        
        return value;
        
    }
}


//Solved