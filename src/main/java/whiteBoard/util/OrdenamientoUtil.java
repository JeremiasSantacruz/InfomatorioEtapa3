package whiteBoard.util;

import whiteBoard.model.Empleado;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OrdenamientoUtil {
    private DateIUtilImp dateUtil;

    public OrdenamientoUtil() {
        this.dateUtil = new DateIUtilImp();
    }

    public List<Empleado> buscarPorLetra(List<Empleado> lista, Character letra){
        return lista.stream().filter(empleado -> {
            Character apellido = empleado.getApellido().toCharArray()[0];
            return apellido.toString().toUpperCase().equals(letra.toString().toUpperCase());
        }).collect(Collectors.toList());
    }

    public Empleado masJoven(List<Empleado> empleados){
        return empleados.stream().min(Comparator.comparingInt(empleado -> {
            return this.dateUtil.edad(empleado.getFecha());
        })).get();
    }

    public Empleado masViejo(List<Empleado> empleados){
        return empleados.stream().max(Comparator.comparingInt(empleado -> {
            return dateUtil.edad(empleado.getFecha());
        })).get();
    }

    public Empleado mejorPagado(List<Empleado> empleados){
        return empleados.stream().max(Comparator.comparingDouble(Empleado::getSueldo)).get();
    }

    public static Empleado peorPagado(List<Empleado> empleados){
        return empleados.stream().min(Comparator.comparingDouble(Empleado::getSueldo)).get();
    }

    public static List<Empleado> ordenarAlfabetico(List<Empleado> lista){
        return lista.stream().sorted(Comparator.comparing(Empleado::getNombreCompleto)).collect(Collectors.toList());
    }


}


