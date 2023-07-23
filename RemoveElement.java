
/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/



class Solution {
    public int removeElement(int[] nums, int val) {

        int contador = 0;

        List<Integer> listaNumbers = new ArrayList<>();
        for(Integer num: nums){
            listaNumbers.add(num);
        }

        while(listaNumbers.contains(Integer.valueOf(val))){
            listaNumbers.remove(Integer.valueOf(val));
            listaNumbers.add(101);
            contador++;
        }

        int n = nums.length - contador;

        for(int i = 0; i < n; i++){
            nums[i] = listaNumbers.get(i);
        }


        return n;
    }
}

//Solved