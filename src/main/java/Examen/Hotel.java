package Examen;

public class Hotel {
    // Habitación check
    public void validarHabitacion(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Debe ingresar los campos requeridos");
        }

        if (!codigo.matches("[1-3]\\d{2}")) {
            throw new IllegalArgumentException("Ingrese una habitación válida");
        }
    }
}
