/*
PROBLEM --------------------------------------------------------------------------------------------------------------

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the 
sum of the two preceding ones, starting from 0 and 1. That is,

SOLUTION ------------------------------------------------------------------------------------------------------------
*/




class Solution {
    public int fib(int n) {
        int acumulator = 0;
        int index = 1;

        List<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(1);

        while(index < n){
            acumulator = lista.get(index - 1) + lista.get(index);
            lista.add(acumulator);
            index++;
        }

        return lista.get(n);
    }
}

//Solved