import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public List<Habitacion> listarDisponibles() {
        List<Habitacion> libres = new ArrayList<>();
        for (Habitacion h : habitaciones) {
            if (h.isDisponible()) {
                libres.add(h);
            }
        }
        return libres;
    }

    @Override
    public String toString() {
        return "Hotel:" + nombre + "\n" +
                "Dirección: " + direccion + "\n" +
                "Total Habitaciones: " + habitaciones.size() + "\n" ;
    }
}
