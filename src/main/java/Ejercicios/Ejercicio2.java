package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1) {
            sumarTres();
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero.");
            continuar = scanner.nextInt();
        }
        scanner.close();
    }

    public static void sumarTres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tres numeros: ");
        Integer uno = scanner.nextInt();
        Integer dos = scanner.nextInt();
        Integer tres = scanner.nextInt();
        System.out.print("El primer numero es " + uno);
        System.out.print("El segundo numero es " + dos);
        System.out.print("El tercero numero es " + tres);
        scanner.close();
    }
}
