
/*
PROBLEM --------------------------------------------------------------------------------------------------------------

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/



class Solution {
    public boolean isHappy(int n) {
        
        //Separa el numero en sus terminos
        String primerNumberString = String.valueOf(n);
        boolean state = true;
        List<Integer> listaNumber = new ArrayList<>();
        listaNumber.add(0);

            
        for(int i = 0; i < primerNumberString.length(); i++){
            int singleNumberInt = Character.getNumericValue(primerNumberString.charAt(i));
            listaNumber.add(singleNumberInt);
        }

        System.out.println(listaNumber);


        //Hacer una funcion que recora el numero como en una lista y guarde un acumulador de sus cuadrados

        //hacer el bucle chequean si la suma es 1
        return true;

    }
}

//Not Solved