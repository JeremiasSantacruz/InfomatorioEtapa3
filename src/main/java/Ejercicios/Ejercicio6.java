package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1) {
            System.out.println("Por favor, ingrese un numero: ");
            nro = scanner.nextInt();
            System.out.println("EL numero ingresado es: " + nro);
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero.");
            continuar = scanner.nextInt();
        }
        scanner.close();
    }
}
