package singleton;

import models.Cliente;
import models.Habitacion;
import models.Reserva;
import models.Servicio;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private static SistemaReservas instancia;
    private final List<Reserva> reservas;
    private final List<Cliente> clientes;
    private final List<Habitacion> habitaciones;
    private final List<Servicio> servicios;

    private SistemaReservas() {
        reservas = new ArrayList<>();
        clientes = new ArrayList<>();
        habitaciones = new ArrayList<>();
        servicios = new ArrayList<>();
    }

    public static SistemaReservas obtenerInstancia() {
        if (instancia == null) {
            instancia = new SistemaReservas();
        }
        return instancia;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    // Métodos para obtener listas de reservas, clientes, habitaciones y servicios
    public List<Reserva> obtenerReservas() {
        return reservas;
    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public List<Habitacion> obtenerHabitaciones() {
        return habitaciones;
    }

    public List<Servicio> obtenerServicios() {
        return servicios;
    }

    public Cliente buscarCliente(String clienteId) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equals(clienteId)) {
                return cliente;
            }
        }
        return null;
    }

    public Habitacion buscarHabitacion(String habitacionId) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getId().equals(habitacionId)) {
                return habitacion;
            }
        }
        return null;
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void eliminarHabitacion(Habitacion habitacion) {
        habitaciones.remove(habitacion);
    }

    public Reserva buscarReserva(String reservaId) {
        for (Reserva reserva : reservas) {
            if (reserva.getId().equals(reservaId)) {
                return reserva;
            }
        }
        return null;
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public Servicio buscarServicio(String servicioId) {
        for (Servicio servicio : servicios) {
            if (servicio.getId().equals(servicioId)) {
                return servicio;
            }
        }
        return null;
    }

    public void eliminarServicio(Servicio servicio) {
        servicios.remove(servicio);
    }

    public void agregarCargoExtra(Reserva reserva, double monto) {
        reserva.setPrecioTotal(reserva.getPrecioTotal() + monto);
    }
}