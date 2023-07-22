
/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/


class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> setNumbers = new HashSet<>();    
        for(int num : nums){
            setNumbers.add(num);
        }

        
        List<Integer> uniqueList = new ArrayList<>(setNumbers);
        Collections.sort(uniqueList);

        int[] output = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(i < uniqueList.size()){
                output[i] = uniqueList.get(i);
            }
            
            nums[i] = output[i];
        }

        return uniqueList.size();
        
    }
}

//Solved