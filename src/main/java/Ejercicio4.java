import java.io.*;
import java.nio.file.Paths;


public class Ejercicio4 {

    public static void main(String[] args) {
        String path = Paths.get("src/main/java/Archivo.txt").toAbsolutePath().toString() ;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
