package factories;

import models.Habitacion;

public class HabitacionFactory {

    public static Habitacion crearHabitacion(String id, String tipo, double precioPorNoche) {
        return new Habitacion(id, tipo, precioPorNoche);
    }
}