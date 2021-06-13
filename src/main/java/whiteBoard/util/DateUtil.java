package whiteBoard.util;

import java.time.LocalDate;

public interface DateUtil {
    /**
     * Metodo que convierte un LocalDate en string
     * @param fecha LocalDate
     * @return String
     */
    String fechaAString(LocalDate fecha);

    /**
     * Metodo para parsear Fecha a localDate YYYY-MM-DD
     * @param string
     * @return LocalDate
     */
    LocalDate fechaALocalDate(String string);

    Integer edad(LocalDate fecha);
}
