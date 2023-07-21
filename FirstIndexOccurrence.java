
/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 
if needle is not part of haystack.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/

class Solution {
    public int strStr(String haystack, String needle) {
        
        char[] haystackList = haystack.toCharArray();
        char[] needleList = needle.toCharArray();
        int output = -1;

        for(int i = 0; i < haystackList.length; i++){
            if(needleList[0] == haystackList[i]){

                int fillup = 0;

                for(int j = 0; j < needleList.length; j++){
                    try{
                        if(haystackList[i + j] == needleList[j]){
                            fillup += 1;
                        }

                    } catch(Exception error){
                        break;
                    }
                } 

                if(fillup == needleList.length){
                    output = i;
                    break;
                } else {
                    output = -1;
                }
            } else {
                output = -1;
            }
        }
        

        return output;
    }
}

//Solved
