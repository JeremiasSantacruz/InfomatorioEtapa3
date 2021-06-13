package whiteBoard;

import com.sun.source.tree.LambdaExpressionTree;
import whiteBoard.model.Empleado;
import whiteBoard.service.ServiceReader;
import whiteBoard.service.ServiceReaderImp;
import whiteBoard.util.DateIUtilImp;
import whiteBoard.util.DateUtil;
import whiteBoard.util.OrdenamientoUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Propuesto5 {


    public static void main(String[] args) throws IOException {
        ServiceReader serviceReader = new ServiceReaderImp();
        OrdenamientoUtil ordenamientoUtil = new OrdenamientoUtil();
        List<Empleado> empleados = serviceReader.obtenerTodos();
        List<Empleado> encontrados =  ordenamientoUtil.buscarPorLetra(empleados, 'k');
        if (encontrados.isEmpty()){
            System.out.println("No se encontro empleados con esa letra.");
        } else {
            System.out.println("Los Empleado son: ");
            encontrados.stream().forEach(empleado -> System.out.println(empleado.toString()));
        }
        System.out.println("El mas joven " + ordenamientoUtil.masJoven(empleados));
        System.out.println("El mas viejo "+ ordenamientoUtil.masViejo(empleados).toString());
        System.out.println("El mejor Pagado " + ordenamientoUtil.mejorPagado(empleados).toString());
        System.out.println("El peor Pagado " + ordenamientoUtil.peorPagado(empleados).toString());
        System.out.println("Ordenados alfabetico " + ordenamientoUtil.ordenarAlfabetico(empleados));
    }




}
