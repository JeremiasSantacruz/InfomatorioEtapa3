package whiteBoard.service;

import whiteBoard.model.Empleado;
import whiteBoard.util.DateIUtilImp;
import whiteBoard.util.DateUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceReaderImp implements ServiceReader {
    private final DateUtil fecha = new DateIUtilImp();
    private BufferedReader br;

    public ServiceReaderImp() {
        String path = Paths.get("src/main/java/whiteBoard/empleados.txt").toAbsolutePath().toString();
        try {
            this.br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Archivo no encontrado.");
        }
    }

    @Override
    public Empleado leerLinea() throws IOException {
//    Cada línea es un --> Empleado → se almacena en una lista
        String line = br.readLine();
        if (line == null || line.isBlank()) {
            return null;
        }
//    Carlos,Sanchez,20-01-1980,45678.08
        String[] campos = line.split(",");
        Empleado empleado = new Empleado();
        empleado.setNombre(campos[0]);
        empleado.setApellido(campos[1]);
        empleado.setFecha(fecha.fechaALocalDate(campos[2]));
        empleado.setSueldo(Double.valueOf(campos[3]));
        return empleado;
    }

    @Override
    public List<Empleado> obtenerTodos() throws IOException {
        // TODO Corregido Lineas en blanco.
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado empleado;
        empleado = leerLinea();
        while (empleado != null) {
            empleados.add(empleado);
            empleado = leerLinea();
        }
        return empleados;
    }

    @Override
    public Boolean guardaEmpleado(Empleado empleado) {
        return null;
    }

}
