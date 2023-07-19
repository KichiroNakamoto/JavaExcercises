/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

SOLUTION ------------------------------------------------------------------------------------------------------------
*/


class Solution {

    public String longestCommonPrefix(String[] strs) {

        String smallest = strs[0];

        for(int k = 0; k < strs.length; k++){
            if (smallest.length() >= strs[k].length()){
                smallest = strs[k];
            }
        }
        
        String finalStr = "";
        char[] reference = smallest.toCharArray();
        boolean state = false; 

        for(int i = 0; i < reference.length; i++){

            for(int j = 0; j < strs.length; j++){

                if(strs[j].toCharArray()[i] == reference[i]){
                    state = true;

                } else {
                    state = false;
                    break;
                }
        
            }
            if(state){
                finalStr += reference[i];
            } else {
                break;
            }
            
        }

        return finalStr;
    }
}

//Solved