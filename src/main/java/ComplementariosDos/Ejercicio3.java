package ComplementariosDos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Crear una list que contenga como elementros la numeracion de cartas de una baranja francesa. Se debera cargar
 * Arraylist imprimir en orden, imprinir en orden inverso y desordenar el arrayList volver a imprimir
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Integer> cartas = new ArrayList<>();
        cartas = (ArrayList<Integer>) crear();
        enOrden(cartas);
        enInverso(cartas);
        desordenado(cartas);
    }

    public static List<Integer> crear(){
        ArrayList<Integer> cartas = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            cartas.add(i);
        }
        return cartas;
    }

    public static void enOrden(List<Integer> lista){
        Collections.sort(lista);
        lista.forEach(System.out::println);
    }

    public static void enInverso(List<Integer> lista){
        Collections.sort(lista, Collections.reverseOrder());
        lista.forEach(System.out::println);
    }

    public static void desordenado(List<Integer> lista){
        Collections.shuffle(lista);
        lista.forEach(System.out::println);
    }

}
