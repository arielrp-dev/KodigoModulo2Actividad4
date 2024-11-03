import decorators.CaracteristicaAdicional;
import models.Cliente;
import models.Habitacion;
import models.Reserva;
import models.Servicio;
import singleton.SistemaReservas;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistemaReservas = SistemaReservas.obtenerInstancia();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Sistema de Reservas de Hotel ===");
            System.out.println("01. Agregar Cliente");
            System.out.println("02. Agregar Habitación");
            System.out.println("03. Agregar Servicio");
            System.out.println("04. Realizar Reserva");
            System.out.println("05. Mostrar Clientes");
            System.out.println("06. Mostrar Habitaciones");
            System.out.println("07. Mostrar Servicios");
            System.out.println("08. Mostrar Reservas");
            System.out.println("09. Eliminar Cliente");
            System.out.println("10. Eliminar Habitación");
            System.out.println("11. Eliminar Reserva");
            System.out.println("12. Eliminar Servicio");
            System.out.println("13. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente(scanner, sistemaReservas);
                    break;
                case 2:
                    agregarHabitacion(scanner, sistemaReservas);
                    break;
                case 3:
                    agregarServicio(scanner, sistemaReservas);
                    break;
                case 4:
                    realizarReserva(scanner, sistemaReservas);
                    break;
                case 5:
                    mostrarClientes(sistemaReservas);
                    break;
                case 6:
                    mostrarHabitaciones(sistemaReservas);
                    break;
                case 7:
                    mostrarServicios(sistemaReservas);
                    break;
                case 8:
                    mostrarReservas(sistemaReservas);
                    break;
                case 9:
                    eliminarCliente(scanner, sistemaReservas);
                    break;
                case 10:
                    eliminarHabitacion(scanner, sistemaReservas);
                    break;
                case 11:
                    eliminarReserva(scanner, sistemaReservas);
                    break;
                case 12:
                    eliminarServicio(scanner, sistemaReservas);
                    break;
                case 13:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 13);
        scanner.close();
    }

    private static void eliminarServicio(Scanner scanner, SistemaReservas sistemaReservas) {
        // Seleccione el servicio a eliminar por ID por medio de un menu
        System.out.println("Seleccione un servicio: ");
        sistemaReservas.obtenerServicios().forEach(System.out::println);
        System.out.print("Ingrese el ID del servicio a eliminar: ");
        String servicioId = scanner.nextLine();
        Servicio servicio = sistemaReservas.buscarServicio(servicioId);

        if (servicio == null) {
            System.out.println("Servicio no encontrado. Asegúrese de que el ID sea correcto.");
        } else {
            sistemaReservas.eliminarServicio(servicio);
            System.out.println("Servicio eliminado exitosamente.");
        }
    }

    private static void mostrarServicios(SistemaReservas sistemaReservas) {
        System.out.println("=== Servicios ===");
        sistemaReservas.obtenerServicios().forEach(System.out::println);
    }

    private static void agregarServicio(Scanner scanner, SistemaReservas sistemaReservas) {
        System.out.print("Ingrese el nombre del servicio: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del servicio: ");
        double precio = scanner.nextDouble();
        Servicio servicio = new Servicio(generarId(), nombre, precio);

        sistemaReservas.agregarServicio(servicio);
        System.out.println("Servicio agregado exitosamente.");
    }

    private static void eliminarReserva(Scanner scanner, SistemaReservas sistemaReservas) {
        // Seleccione la reserva a eliminar por ID por medio de un menu
        System.out.println("Seleccione una reserva: ");
        sistemaReservas.obtenerReservas().forEach(System.out::println);
        System.out.print("Ingrese el ID de la reserva a eliminar: ");
        String reservaId = scanner.nextLine();
        Reserva reserva = sistemaReservas.buscarReserva(reservaId);

        if (reserva == null) {
            System.out.println("Reserva no encontrada. Asegúrese de que el ID sea correcto.");
        } else {
            sistemaReservas.eliminarReserva(reserva);
            System.out.println("Reserva eliminada exitosamente.");
        }
    }

    private static void eliminarHabitacion(Scanner scanner, SistemaReservas sistemaReservas) {
        // Seleccione la habitación a eliminar por ID por medio de un menu
        System.out.println("Seleccione una habitación: ");
        sistemaReservas.obtenerHabitaciones().forEach(System.out::println);
        System.out.print("Ingrese el ID de la habitación a eliminar: ");
        String habitacionId = scanner.nextLine();
        Habitacion habitacion = sistemaReservas.buscarHabitacion(habitacionId);

        if (habitacion == null) {
            System.out.println("Habitación no encontrada. Asegúrese de que el ID sea correcto.");
        } else {
            sistemaReservas.eliminarHabitacion(habitacion);
            System.out.println("Habitación eliminada exitosamente.");
        }
    }

    private static void eliminarCliente(Scanner scanner, SistemaReservas sistemaReservas) {
        // Seleccione el cliente a eliminar por ID por medio de un menu
        System.out.println("Seleccione un cliente: ");
        sistemaReservas.obtenerClientes().forEach(System.out::println);
        System.out.print("Ingrese el ID del cliente a eliminar: ");
        String clienteId = scanner.nextLine();
        Cliente cliente = sistemaReservas.buscarCliente(clienteId);
        if (cliente == null) {
            System.out.println("Cliente no encontrado. Asegúrese de que el ID sea correcto.");
        } else {
            sistemaReservas.eliminarCliente(cliente);
            System.out.println("Cliente eliminado exitosamente.");
        }
    }

    private static void mostrarHabitaciones(SistemaReservas sistemaReservas) {
        System.out.println("=== Habitaciones ===");
        // Obtener la lista de habitaciones del sistema usando el método obtenerHabitaciones y toString
        sistemaReservas.obtenerHabitaciones().forEach(System.out::println);
    }

    private static void mostrarClientes(SistemaReservas sistemaReservas) {
        System.out.println("=== Clientes ===");
        // Obtener la lista de clientes del sistema usando el método obtenerClientes y toString
        sistemaReservas.obtenerClientes().forEach(System.out::println);
    }

    private static void mostrarReservas(SistemaReservas sistemaReservas) {
        System.out.println("=== Reservas ===");
        // Obtener la lista de reservas del sistema usando el método obtenerReservas y toString
        sistemaReservas.obtenerReservas().forEach(System.out::println);
    }

    private static void agregarCliente(Scanner scanner, SistemaReservas sistemaReservas) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico del cliente: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese el número de teléfono del cliente: ");
        String telefono = scanner.nextLine();
        Cliente cliente = new Cliente(generarId(), nombre, email, telefono);

        // Mostrar el cliente agregado
        System.out.println(cliente);

        sistemaReservas.agregarCliente(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }

    private static void agregarHabitacion(Scanner scanner, SistemaReservas sistemaReservas) {
        System.out.print("Ingrese el tipo de la habitación: ");
        String numero = scanner.nextLine();
        System.out.print("Ingrese el costo de la habitación: ");
        double costo = scanner.nextDouble();
        Habitacion habitacion = new Habitacion(generarId(), numero, costo);

        sistemaReservas.agregarHabitacion(habitacion);
        System.out.println("Habitación agregada exitosamente.");
    }

    private static void realizarReserva(Scanner scanner, SistemaReservas sistemaReservas) {
        // Seleccion del cliente por ID por medio de un menu
        System.out.println("Seleccione un cliente: ");
        sistemaReservas.obtenerClientes().forEach(System.out::println);
        System.out.print("Ingrese el ID del cliente: ");
        String clienteId = scanner.nextLine();
        Cliente cliente = sistemaReservas.buscarCliente(clienteId);

        if (cliente == null) {
            System.out.println("Cliente no encontrado. Asegúrese de que el ID sea correcto.");
            return;
        }

        // Solicitar la habitación a reservar por un menu
        System.out.println("Seleccione una habitación: ");
        sistemaReservas.obtenerHabitaciones().forEach(System.out::println);
        System.out.print("ingrese el ID de la habitacion a reservar: ");
        String habitacionId = scanner.nextLine();
        Habitacion habitacion = sistemaReservas.buscarHabitacion(habitacionId);

        if (habitacion == null) {
            System.out.println("Habitación no encontrada. Asegúrese de que el ID sea correcto.");
            return;
        }

        // Verificar si la habitación está disponible
        if (!habitacion.isDisponible()) {
            System.out.println("La habitación no está disponible.");
            return;
        }

        // Solicitar las fechas de inicio y fin de la reserva
        System.out.print("Ingrese la fecha de inicio de la reserva (YYYY-MM-DD): ");
        String fechaInicio = scanner.nextLine();
        // Convertir la fecha de inicio a un objeto Date
        Date fechaInicioDate = Date.valueOf(fechaInicio);
        System.out.print("Ingrese la fecha de fin de la reserva (YYYY-MM-DD): ");
        String fechaFin = scanner.nextLine();
        // Convertir la fecha de fin a un objeto Date
        Date fechaFinDate = Date.valueOf(fechaFin);

        Reserva reserva = new Reserva(generarId(), cliente, habitacion, fechaInicioDate, fechaFinDate);

        // agregar servicio adicional
        System.out.print("Desea agregar un servicio adicional? (S/N): ");
        String respuesta = scanner.nextLine();
        double precioAdicional = 0;
        if (respuesta.equalsIgnoreCase("S")) {
            // Mostrar los servicios adicionales disponibles por medio de un menu
            System.out.println("Seleccione un servicio adicional: ");
            sistemaReservas.obtenerServicios().forEach(System.out::println);
            System.out.print("Ingrese el ID del servicio adicional: ");
            String servicioId = scanner.nextLine();
            Servicio servicio = sistemaReservas.buscarServicio(servicioId);
            if (servicio == null) {
                System.out.println("Servicio no encontrado. Asegúrese de que el ID sea correcto.");
                return;
            }
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            // Agregar el precio del servicio al precio total de la reserva
            precioAdicional = servicio.getPrecio() * cantidad;
            CaracteristicaAdicional caracteristicaAdicional = new CaracteristicaAdicional(reserva ,servicio, precioAdicional);
            sistemaReservas.agregarReserva(caracteristicaAdicional);
            System.out.println("Reserva con servicio adicional agregado exitosamente.");
        } else {
            sistemaReservas.agregarReserva(reserva);
            System.out.println("Reserva realizada exitosamente.");
        }
    }

    // generador de IDs para las entidades con 4 caracteres aleatorios en mayúsculas
    private static String generarId() {
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char randomChar = (char) (Math.random() * 26 + 'A');
            id.append(randomChar);
        }
        return id.toString();
    }
}
