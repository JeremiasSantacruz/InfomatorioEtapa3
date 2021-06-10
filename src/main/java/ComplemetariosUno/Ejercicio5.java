package ComplemetariosUno;


import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese dos numeros para multiplicar: ");
        Integer numero1 = scanner.nextInt();
        Integer numero2 = scanner.nextInt();
        System.out.println(numero1 + " x " + numero2 + " = " + numero1 * numero2);
    }

    public static void multiplicacion(Integer num, Integer num2){
        System.out.println(num + " x " + num2 + " = " + num * num2);
    }


}
