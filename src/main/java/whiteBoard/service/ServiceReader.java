package whiteBoard.service;

import whiteBoard.model.Empleado;

import java.io.IOException;
import java.util.List;

public interface ServiceReader {
    //    Crear un método que trate cada línea (String), donde separa los campos y creará el objeto Empleado.

    /**
     * Lee una linea del Archivo y devuelve el empleado
     *
     * @return Empleado
     */
    Empleado leerLinea() throws IOException;

    /**
     * Lee el archivo y devuelve una lista de Empleados.
     * @return List de empledos
     * @throws IOException
     */
    List<Empleado> obtenerTodos() throws IOException;

    Boolean guardaEmpleado(Empleado empleado);


}
