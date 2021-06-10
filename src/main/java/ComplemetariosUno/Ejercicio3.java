package ComplemetariosUno;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        Integer numero = scanner.nextInt();
        scanner.close();
        String msg = "";
        mostrar(numero,  msg);
    }

    public static void mostrar(Integer num, String msg){
        if (num == 1){
            System.out.println(msg + " " + num);
        } else {
            System.out.println(msg);
            msg = msg + " " + num.toString();
            mostrar(num-1, msg);
        }
    }

}
