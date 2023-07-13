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