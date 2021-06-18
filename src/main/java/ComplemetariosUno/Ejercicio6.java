package ComplemetariosUno;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese dos numeros para multiplicar: ");
        Integer numero1 = scanner.nextInt();
        Integer numero2 = scanner.nextInt();
        Integer numero3, numero4 = scanner.nextInt();
        System.out.println(numero1 + " elevado a " + numero2 + " = " + elevado(numero1, numero2));
    }

    public static Integer elevado(Integer num, Integer num2) {
        if (num2 <= 1) {
            return num;
        } else {
            return num * elevado(num, num2 - 1);
        }
    }
}
