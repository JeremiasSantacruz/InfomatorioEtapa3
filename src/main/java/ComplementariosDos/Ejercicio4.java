package ComplementariosDos;

import java.util.ArrayList;
import java.util.List;

/**
 * Carga un arraylist de 12 nombres de estudiantes luego separarlos en 3 cursos e imprimir dichos cursos
 *
 */
public class Ejercicio4 {

   public static void main(String[] args) {
      ArrayList<String> alumnos = new ArrayList<>();
      ArrayList<List<String>> cursos = new ArrayList<>();
      alumnos.add("Javier");
      alumnos.add("Jose");
      alumnos.add("Jesus");
      alumnos.add("Juana");
      alumnos.add("Maria");
      alumnos.add("Marcos");
      alumnos.add("Manuela");
      alumnos.add("Miranda");
      alumnos.add("Oscar");
      alumnos.add("Omar");
      alumnos.add("Orfelia");
      alumnos.add("Olga");
      cursos.add(alumnos.subList(0, 4));
      cursos.add(alumnos.subList(4, 8));
      cursos.add(alumnos.subList(8, 12));
      System.out.println("alumnos = " + cursos);
   }

}
