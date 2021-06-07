package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
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
