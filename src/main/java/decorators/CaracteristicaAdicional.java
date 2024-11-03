package decorators;

import models.Reserva;
import models.Servicio;

public class CaracteristicaAdicional extends ReservaDecorator {
    private final Servicio servicio;
    private final double costoAdicional;

    public CaracteristicaAdicional(Reserva reservaDecorada, Servicio servicio, double costoAdicional) {
        super(reservaDecorada);
        this.servicio = servicio;
        this.costoAdicional = costoAdicional;
    }

    @Override
    public double getPrecioTotal() {
        return super.getPrecioTotal() + costoAdicional;
    }

    @Override
    public String toString() {
        return super.toString() + ", Caracteristica Adicional: " + servicio.getNombre() + ", Precio total mas coste adicional: $" + getPrecioTotal() + " USD";
    }
}