package factories;

import models.Servicio;

public class ServicioFactory {

    public static Servicio crearServicio(String id, String nombre, double precio) {
        return new Servicio(id, nombre, precio);
    }
}