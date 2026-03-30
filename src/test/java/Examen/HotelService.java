package Examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HotelService {

    @Test
    void testHabitacionInvalida() {
        Hotel service = new Hotel();
        service.validarHabitacion("212");
    }
}
