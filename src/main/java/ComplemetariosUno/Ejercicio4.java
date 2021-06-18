package ComplemetariosUno;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer numero = scanner.nextInt();
        scanner.close();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }

    public static Integer factorial(Integer num) {
        if (num <= 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }
}
