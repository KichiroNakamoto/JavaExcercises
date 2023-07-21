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


    public boolean isValid(String str) {

        List<String> pares = Arrays.asList("()", "[]", "{}");
        boolean state = false;
        boolean reinicio = false;

        if(str.length() % 2 == 0){
            state = true;

            for(int i = 0; i < str.length() - 1; i++){

                i = reinicio ? 0 : i;

                for(int j = 0; j < pares.size(); j++){
                    String par = Character.toString(str.charAt(i)) + 
                    Character.toString(str.charAt(i + 1));
                    
                    if(par.equals(pares.get(j))){
                        String resultado = str.replace(pares.get(j), "");
                        reinicio = true;
                        str = resultado;
                        i -= 2;
                        break;
                    }else {
                        reinicio = false;
                    }
                }
            }
        }else {
            state = false;
        }    

        return (str.length() == 0 && state);
    }
}


//Solved