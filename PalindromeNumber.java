/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given an integer x, return true if x is a palindrome, and false otherwise.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/


class Solution {
    public boolean isPalindrome(int x) {

        String numero = String.valueOf(x);
        char[] list = numero.toCharArray();
        int n = list.length;
        boolean state = true;

        for(int i = 0; i < n/2; i++){
            if(list[i] != list[n-1-i]){
                state = false;
                break;
            }
        }

        return state;
    }
}


//Solved