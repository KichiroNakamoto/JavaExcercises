
/*
PROBLEM --------------------------------------------------------------------------------------------------------------

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/




class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n - 1] <= 8){
            digits[n - 1] = digits[n - 1] + 1;
            return digits;
        }else{
            int sumaIn = 0;
            int[] digits_big = new int[n + 1];
            for (int i = 0; i < digits.length; i++) {
                sumaIn += sumaIn*10 + digits[i]; 
            }

            sumaIn += 1;
            System.out.println(sumaIn);

            return digits_big;


        }
    }
}


// Not Solved