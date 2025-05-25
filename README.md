Sistema de reservas de hotel - Requerimientos funcionales

Crear hotel 
--------------------------------------------------------------- |                                                    
Nombre: Crear Hotel                                             |
Resumen: El sistema crea nuevos hoteles con nombre y dirección. |
Entradas: Nombre del hotel, dirección.                          |
Resultado: Hotel creado sin habitaciones.                       |


Agregar habitación
-----------------------------------------------------------------------------|
Nombre: Agregar habitación                                                   |
Resumen: Añadir habitaciones a un hotel.                                     |
Entradas: Hotel, número de habitación, tipo (individual/doble/suite), precio.|
Resultado: Habitación agregada y disponible.                                 |


Ver habitaciones disponibles
-------------------------------------------------------------------|
Nombre: Ver habitaciones disponibles                               |
Resumen: Mostrar habitaciones libres para reservar.                |
Entradas: Hotel (opcional), fechas (opcional).                     |
Resultado: Lista de habitaciones con número, tipo, precio y hotel. |

Hacer reserva
-------------------------------------------------------------------------------|
Nombre: Hacer reserva                                                          |
Resumen: Los clientes reservan habitaciones para fechas específicas.           |
Entradas: Nombre del cliente, habitación, fecha entrada, fecha salida.         |
Resultado: Reserva confirmada, habitación ocupada, número de reserva generado. |

Cancelar reserva
--------------------------------------------------------------|
Nombre: Cancelar reserva                                      |
Resumen: Cancelar reservas y liberar habitaciones.            |
Entradas: Número de reserva o datos del cliente.              |
Resultado: Reserva cancelada, habitación disponible otra vez. |

Ver reservas
----------------------------------------------------------------------|
Nombre: Ver reservas                                                  |
Resumen: Mostrar todas las reservas activas.                          |
Entradas: Filtros: hotel, cliente, fechas (opcional).                 |
Resultado: Lista de reservas con cliente, habitación, fechas y estado.|

Cambiar estado de habitación
-------------------------------------------------------------|
Nombre: Cambiar estado de habitación                         |
Resumen: Cambiar si una habitación está disponible u ocupada.|
Entradas: Habitación, nuevo estado (disponible/ocupada).     |
Resultado: Estado actualizado en el sistema.                 |

Registrar hotel en sistema
------------------------------------------------|
Nombre: Registrar hotel en sistema              |
Resumen: Agregar hoteles al sistema principal.  |
Entradas: Hotel creado con habitaciones.        |
Resultado: Hotel disponible para reservas.      |


![image](https://github.com/user-attachments/assets/c6bdba45-740d-4f0e-8715-54d1eafb9cb0)

