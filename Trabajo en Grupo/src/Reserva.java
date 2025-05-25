import java.time.LocalDate;

public class Reserva {
    private static int siguienteId = 1;

    private int id;
    private String nombreCliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacion;

    public Reserva(String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, Habitacion habitacion) {
        this.id = siguienteId++;
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion = habitacion;
        habitacion.setDisponible(false);
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void cancelar() {
        habitacion.setDisponible(true);
    }

    @Override
    public String toString() {
        return "\n" + "Reserva: " + id + "\n" +
                "Cliente: " + nombreCliente + "\n" +
                "Fecha Entrada: " + fechaEntrada + "\n" +
                "Fecha Salida: " + fechaSalida + "\n" +
                "N° Habitacion: " + habitacion.getNumero();
    }
}
