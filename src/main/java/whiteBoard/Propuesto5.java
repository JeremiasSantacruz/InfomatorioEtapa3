package whiteBoard;

import whiteBoard.model.Empleado;
import whiteBoard.service.ServiceReader;
import whiteBoard.service.ServiceReaderImp;
import whiteBoard.util.OrdenamientoUtil;

import java.io.IOException;
import java.util.List;

public class Propuesto5 {


    public static void main(String[] args) throws IOException {
        ServiceReader serviceReader = new ServiceReaderImp();
        OrdenamientoUtil ordenamientoUtil = new OrdenamientoUtil();
        List<Empleado> empleados = serviceReader.obtenerTodos();
        List<Empleado> encontrados = ordenamientoUtil.buscarPorLetra(empleados, 'k');
        if (encontrados.isEmpty()) {
            System.out.println("No se encontro empleados con esa letra.");
        } else {
            System.out.println("Los Empleado son: ");
            encontrados.stream().forEach(empleado -> System.out.println(empleado.getNombreCompleto()));
        }
        System.out.println("El mas joven " + ordenamientoUtil.masJoven(empleados).getNombreCompleto());
        System.out.println("El mas viejo " + ordenamientoUtil.masViejo(empleados).getNombreCompleto());
        System.out.println("El mejor Pagado " + ordenamientoUtil.mejorPagado(empleados).getNombreCompleto());
        System.out.println("El peor Pagado " + OrdenamientoUtil.peorPagado(empleados).getNombreCompleto());
        System.out.println("Ordenados alfabetico: ");
        OrdenamientoUtil.ordenarAlfabetico(empleados).stream()
                .forEach(empleado -> System.out.println(empleado.getNombreCompleto()));
    }


}
