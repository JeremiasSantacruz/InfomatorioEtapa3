package ComplemetariosUno;

import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.next();
        List<String> letrasMayus = new ArrayList<String>();
        for (String letra: cadena.split("") ) {
            letrasMayus.add(letra.toUpperCase());
        }
        cadena = String.join("", letrasMayus);
        System.out.println(cadena);
    }

}
