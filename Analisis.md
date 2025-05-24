# Sistema de Reservas de Hotel

## Objetivo del sistema:
Desarrollar un sistema que permita gestionar hoteles, habitaciones y reservas de
forma eficiente.

#

### 1. Clase Hotel
 El sistema debe permitir crear hoteles con un nombre y una dirección.

• Cada hotel debe poder tener una lista de habitaciones.

• Debe ser posible agregar nuevas habitaciones al hotel.

• El hotel debe poder mostrar un listado de habitaciones disponibles.

### 2. Clase Habitación
• Cada habitación debe tener un número identificador, tipo (individual, doble,
suite) y precio por noche.

• Debe indicarse si la habitación está disponible o no.

• Se debe poder cambiar el estado de disponibilidad de la habitación.

### 3. Clase Reserva
• Una reserva debe tener una habitación asociada, nombre del cliente, fecha de
entrada y fecha de salida.

• Al hacer una reserva, la habitación correspondiente debe marcarse como no
disponible.

• Debe existir un método para cancelar una reserva y devolver la habitación a
disponible.

## Análisis del problema:

|<!-- -->|<!-- -->|
|---------|------|
| Cliente |Empresa hotelera que necesita gestionar habitaciones y reserva.|
| Usuario | Recepcionista del hotel, encargado de registrar y consultar reservas|
| Requerimiento Funcional | Permitir registrar hoteles, agregar habitaciones y realizar reservas. |
| Mundo del problema | Actualmente se gestiona todo en papel o Excel, generando errores. |
| Requerimiento no funcional | El sistema debe desarrollarse en Java, ser rápido y tener código legible.|

 
## Requerimientos Funcionales:

|<!-- -->|<!-- -->|
|--------|------|
| Nombre |Realizar reserva|
| Resumen | El usuario puede registrar una reserva parauna habitación.|
| Entradas | Datos del cliente, número de habitación,fecha de entrada/salida |
| Resultado | La reserva queda registrada y la habitaciónse marca ocupada |

## Entidades:

|Entidad|Descripción|
|--------|------|
| Hotel |Representa el hotel y contiene su nombre, dirección y lista de habitaciones.|
| Habitación | Espacio del hotel con número, tipo, precio y estado (disponible o no).|
| Reserva | Registra la ocupación de una habitación por parte de un cliente en ciertas fechas. |

## Atributos:

| Atributo | Valores Posibles| Comentarios |
|--------|------|------|
| nombreHotel | Texto | Identificador del hotel |
| direccionHotel | Texto | Dirección física del hotel |
| numeroHabitacion | Entero | Número único para identificar la habitación |
| tipoHabitacion | Individual / Doble / Suite | Individual / Doble / Suite |
| precioHabitacion | Decimal | Precio por noche |
| Disponibilidad | true / false | Indica si la habitación está libre para reservar |
| nombreCliente | Texto | Nombre del huésped |
| fechaEntrada / Salida | Fecha (ej. 2025-05-24) | Periodo de ocupación de la habitación |
