// SistemaReservas.java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Hotel> hoteles;
    private List<Reserva> reservas;

    public SistemaReservas() {
        this.hoteles = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void registrarHotel(Hotel h) {
        hoteles.add(h);
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public Reserva crearReserva(String cliente, Hotel hotel,
                                int numHabitacion,
                                LocalDate entrada, LocalDate salida) {
        Habitacion buscada = null;
        for (Habitacion h : hotel.getHabitaciones()) {
            if (h.getNumero() == numHabitacion && h.isDisponible()) {
                buscada = h;
                break;
            }
        }
        if (buscada == null) {
            throw new IllegalStateException("Habitación no disponible o no existe: " + numHabitacion);
        }
        Reserva r = new Reserva(cliente, entrada, salida, buscada);
        reservas.add(r);
        return r;
    }

    public void cancelarReserva(int idReserva) {
        Reserva encontrada = null;
        for (Reserva r : reservas) {
            if (r.getId() == idReserva) {
                encontrada = r;
                break;
            }
        }
        if (encontrada != null) {
            encontrada.cancelar();
            reservas.remove(encontrada);
        }
    }

    public List<Habitacion> consultarDisponibilidad(Hotel hotel) {
        return hotel.listarDisponibles();
    }

    public List<Reserva> verReservas() {
        return reservas;
    }
}
