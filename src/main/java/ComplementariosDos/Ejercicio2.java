package ComplementariosDos;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            numeros.add(i);
        }
        tamanioYvalor(numeros);
        numeros.add(6);
        tamanioYvalor(numeros);
        numeros.add(0, 0);
        tamanioYvalor(numeros);

    }

    public static void tamanioYvalor(ArrayList arreglo){
        System.out.println("El tamanio del arreglo es de: " + arreglo.size());
        System.out.println(arreglo);
    }
}
