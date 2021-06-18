package whiteBoard.util;

import whiteBoard.model.Empleado;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenamientoUtil {
    private final DateIUtilImp dateUtil;

    public OrdenamientoUtil() {
        this.dateUtil = new DateIUtilImp();
    }

    public static Empleado peorPagado(List<Empleado> empleados) {
        return empleados.stream().min(Comparator.comparingDouble(Empleado::getSueldo)).get();
    }

    public static List<Empleado> ordenarAlfabetico(List<Empleado> lista) {
        return lista.stream().sorted(Comparator.comparing(Empleado::getNombreCompleto)).collect(Collectors.toList());
    }

    public List<Empleado> buscarPorLetra(List<Empleado> lista, Character letra) {
        return lista.stream().filter(empleado -> {
            Character apellido = empleado.getApellido().toCharArray()[0];
            return apellido.toString().equalsIgnoreCase(letra.toString());
        }).collect(Collectors.toList());
    }

    public Empleado masJoven(List<Empleado> empleados) {
        //TODO Agregar comparacion mas exacta.
        return empleados.stream().min(Comparator.comparingInt(empleado -> {
            return this.dateUtil.edad(empleado.getFecha());
        })).get();
    }

    public Empleado masViejo(List<Empleado> empleados) {
        //TODO Agregar comparacion mas exacta.
        return empleados.stream().max(Comparator.comparingInt(empleado -> {
            return dateUtil.edad(empleado.getFecha());
        })).get();
    }

    public Empleado mejorPagado(List<Empleado> empleados) {
        return empleados.stream().max(Comparator.comparingDouble(Empleado::getSueldo)).get();
    }


}


