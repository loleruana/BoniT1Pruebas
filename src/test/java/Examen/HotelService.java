package Examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HotelService {

    @Test
    void testHabitacionInvalida() {
        Hotel service = new Hotel();
        service.validarHabitacion("212");
    }

    @Test
    @DisplayName("Prueba de nombre inválido")
    void testNombreErroneo() {
        Hotel h = new Hotel();
        h.validarNombre("Sol");
    }

    @Test
    @DisplayName("Prueba de fecha inválida ")
    void testFechaPasada() {
        Hotel h = new Hotel();
        h.validarFechaReserva(LocalDate.now());
    }
}
