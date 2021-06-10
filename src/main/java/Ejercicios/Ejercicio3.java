package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1 ) {
            evaluarNota();
            System.out.println("Si desea continuar presione 1, sino cualquier otro numero.");
            continuar = scanner.nextInt();
        }
        scanner.close();
    }

    public static void evaluarNota(){
        System.out.print("Ingrese la nota");
        Scanner scanner = new Scanner(System.in);
        Integer nota = scanner.nextInt();
        scanner.close();
        if (nota > 92 ){
            System.out.print("Excelente");
        } else if (nota > 84){
            System.out.print("Sobresaliente");
        } else if (nota > 74){
            System.out.println("Distinguido");
        } else if (nota > 59){
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado.");
        }
    }

}
