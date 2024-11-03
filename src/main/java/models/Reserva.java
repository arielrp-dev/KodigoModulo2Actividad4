package models;

import java.util.Date;

public class Reserva {
    private String id;
    private Cliente cliente;
    private Habitacion habitacion;
    private Date fechaInicio;
    private Date fechaFin;
    private double precioTotal;

    public Reserva(String id, Cliente cliente, Habitacion habitacion, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        calcularPrecioTotal();
        setHabitacionOcupada(habitacion);
        System.out.println("estado de la habitacion: " + habitacion.isDisponible());
    }

    private void calcularPrecioTotal() {
        long diffInMillies = fechaFin.getTime() - fechaInicio.getTime();
        long diasReservados = diffInMillies / (1000 * 60 * 60 * 24);
        this.precioTotal = diasReservados * habitacion.getPrecioPorNoche();
    }

    public void setHabitacionOcupada(Habitacion habitacion) {
        habitacion.setDisponible(false);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
        calcularPrecioTotal(); // Recalcular el precio total si se cambia la habitación
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
        calcularPrecioTotal(); // Recalcular el precio total si se cambia la fecha
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
        calcularPrecioTotal(); // Recalcular el precio total si se cambia la fecha
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", Cliente: " + cliente +
                ", Habitacion: " + habitacion +
                ", Fecha Inicio: " + fechaInicio +
                ", Fecha Fin: " + fechaFin +
                ", Precio Total: $" + precioTotal + " USD";
    }
}
