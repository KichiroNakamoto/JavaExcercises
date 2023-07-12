import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        StringBuilder builder = new StringBuilder();

        for(int j = 0; j < nums.length; j++){
            builder.append(nums[j]);
        }

        String numbers = builder.toString();

        Pattern regex = Pattern.compile("(\\w)\\1*");
        Matcher matcher = regex.matcher(numbers);

        ArrayList<String> result = new ArrayList<>();

        for (; matcher.find(); ) {
             result.add(matcher.group());
        }

        for (String grupo : result) {
            if (grupo.length() == 1) {
                char[] toChar = grupo.toCharArray();
                int number = Integer.parseInt(String.valueOf(toChar[0]));
                return number;
            }
        }

        return -1;
    }
}