/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/



class Solution {


    public boolean isValid(String s) {
        
        char[] charac = {'(','[','{',')',']','}'};
        char[] list = s.toCharArray();
        int n = list.length; 
        boolean[] stateList = new boolean[n];
        int[] indexCharList = new int[n];
        int[] indexPositionList = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= 2; j++){
                if(list[i] == charac[j]){
                    stateList[i] = true;
                    indexCharList[i] = j;
                    indexPositionList[i] = i;
                    System.out.println(stateList[i] + "," + indexCharList[i] + "," + indexPositionList[i]);
                }
            }

            for(int j = 3; j < charac.length; j++){
                if(list[i] == charac[j]){
                    stateList[i] = false;
                    indexCharList[i] = j;
                    indexPositionList[i] = i;
                    System.out.println(stateList[i] + "," + indexCharList[i] + "," + indexPositionList[i]);
                }
            }
         }

        boolean totalState = true;

        for(int i = 0; i < n; i++){
            if(stateList[i] == true){
                System.out.println("Entro 1" + "llave que abre es: " + charac[indexCharList[i]]);               
                for(int k = 0; k <= n - 1 ; k++){
                    if(stateList[n - k - 1] == false && indexCharList[n - k - 1] == indexCharList[i] + 3){
                        System.out.println("Entro 2" + "llave que cierra es: " + charac[indexCharList[n - k - 1]]);
                    }
                }
            }

            
        }

        return totalState; 
    }
}