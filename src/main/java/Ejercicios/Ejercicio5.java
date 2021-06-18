package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1) {
            imprimirSumaDiez();
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero.");
            continuar = scanner.nextInt();
        }
        scanner.close();
    }

    public static void imprimirSumaDiez() {
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        scan.close();
        for (int i = 0; i <= 10; i++) {
            System.out.println("nro " + " + " + i + " = " + nro + i);
        }
    }
}
