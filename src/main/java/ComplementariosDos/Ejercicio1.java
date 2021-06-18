package ComplementariosDos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su ciudades favoritas: ");
            ciudades.add(scanner.nextLine());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("#" + (i + 1) + " - " + ciudades.get(i));
        }
    }

}
