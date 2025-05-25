import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();

        Hotel h = new Hotel("Hotel Plaza", "Latacunga, Cotopaxi");
        h.agregarHabitacion(new Habitacion(101, "Individual", 50.0));
        h.agregarHabitacion(new Habitacion(102, "Doble", 80.0));
        h.agregarHabitacion(new Habitacion(201, "Suite", 120.0));

        sistema.registrarHotel(h);

        System.out.println(h);
        System.out.println("Disponibles: \n " + sistema.consultarDisponibilidad(h));

        // Crear una reserva
        Reserva r1 = sistema.crearReserva("Juan Pérez", h, 101, LocalDate.of(2025, 6, 1), LocalDate.of(2025, 6, 5));
        System.out.println("\nReserva creada:" + r1);

        System.out.println("Disponibles tras reserva: " + sistema.consultarDisponibilidad(h));

        // Cancelar reserva
        sistema.cancelarReserva(r1.getId());
        System.out.println("Disponibles tras cancelación: " + sistema.consultarDisponibilidad(h));
    }
}
