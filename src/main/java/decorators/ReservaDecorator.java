package decorators;

import models.Reserva;

public abstract class ReservaDecorator extends Reserva {
    protected Reserva reservaDecorada;

    public ReservaDecorator(Reserva reservaDecorada) {
        super(reservaDecorada.getId(), reservaDecorada.getCliente(), reservaDecorada.getHabitacion(),
                reservaDecorada.getFechaInicio(), reservaDecorada.getFechaFin());
        this.reservaDecorada = reservaDecorada;
    }

    @Override
    public double getPrecioTotal() {
        return reservaDecorada.getPrecioTotal();
    }
}