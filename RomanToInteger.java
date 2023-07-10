/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/


import java.util.ArrayList;
import java.util.List;

class Solution {
   public int romanToInt(String s) {

        String[] toRoman = {"I", "V", "X", "L", "C", "D", "M"};
        int[] toNumber = {1, 5, 10, 50, 100, 500, 1000};
        char[] list = s.toCharArray();
        List<Integer> historial = new ArrayList<>();
        historial.add(0);
        int sum = 0;

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < toRoman.length; j++){
                if(String.valueOf(list[i]).equals(toRoman[j])){
                    historial.add(toNumber[j]);

                    if(historial.get(i+1) > historial.get(i)){
                        sum += toNumber[j];
                        sum -= 2*historial.get(i);    
                    } else {
                        sum += toNumber[j];
                    } 
                }
            }
        }

        return sum;

    }
}


//Solved