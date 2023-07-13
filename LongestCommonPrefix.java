/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

SOLUTION ------------------------------------------------------------------------------------------------------------
*/


class Solution {

    public String FindLongest(String[] stringList){
        String longest = stringList[0];

        for(int k = 0; k < stringList.length; k++){
            if (longest.length() <= stringList[k].length()){
                longest = stringList[k];
            }
        }

        System.out.println(longest);
        return longest;
    }


    public String longestCommonPrefix(String[] strs) {

        List<Character> prefix = new ArrayList<>();

        char[] reference = FindLongest(strs).toCharArray();
        String finalStr = "";

        for(int i = 1; i <= strs.length - 1; i++){
            
            char[] palabraList = strs[i].toCharArray();

                for (int j = 0; j < palabraList.length; j++){
                    if ( reference[j] == palabraList[j]){
                        System.out.println(reference[j]);
                        prefix.add(reference[j]);

                    }
                }
               
                           
        }


        StringBuilder builder = new StringBuilder();
        for(Character c : prefix){
            builder.append(c);
        }

        String prefixBuilder =  builder.toString();

        return prefixBuilder;

    }
}

//Not Solved