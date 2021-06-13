package whiteBoard.util;

import whiteBoard.util.DateUtil;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateIUtilImp implements DateUtil {
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    public String fechaAString(LocalDate fecha) {
        return fecha.format(formatter);
    }

    @Override
    public LocalDate fechaALocalDate(String string) {
        return LocalDate.parse(string, formatter);
    }

    @Override
    public Integer edad(LocalDate fecha) {
        if (fecha != null) {
            return Period.between(fecha, LocalDate.now()).getYears();
        }
        return null;
    }
}
