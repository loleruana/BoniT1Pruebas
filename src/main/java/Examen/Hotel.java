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

    // Nombre del cliente check
    public void validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Debe ingresar los campos requeridos");
        }

        if (!nombre.matches("[a-zA-Z]{4,}")) {
            throw new IllegalArgumentException(
                    "Recuerde que el nombre del cliente debe contener al menos cuatro caracteres"
            );
        }
    }
}
