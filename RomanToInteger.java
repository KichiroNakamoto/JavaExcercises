import java.util.ArrayList;
import java.util.List;

class Solution {
   public int romanToInt(String s) {

        String[] toRoman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] toNumber = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        char[] list = s.toCharArray();
        List<Integer> historial = new ArrayList<>();
        historial.add(0);
        int sum = 0;

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < toRoman.length; j++){
                if(String.valueOf(list[i]).equals(toRoman[j])){
                    historial.add(toNumber[j]);

                    if(historial.get(i+1) > historial.get(i)){
                        sum = sum + toNumber[j];
                        sum = sum - 2*historial.get(i);    
                    } else {
                        sum = sum + toNumber[j];
                    } 
                }
            }
        }

        return sum;

    }
}