

/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/




import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int lengthOfLastWord(String s) {
        
        Pattern patron = Pattern.compile("\\s+");
        Matcher separador = patron.matcher(s);

        String[] listaPalabras = separador.replaceAll(" ").trim().split(" ");
        String ultimaPalabra = listaPalabras[listaPalabras.length - 1];

        char[] ultimaPalabraChar = ultimaPalabra.toCharArray();

        return ultimaPalabraChar.length;        


    }
}


// Solved