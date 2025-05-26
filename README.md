Casos de prueba - Sistema de Reservas de Hotel

---

1. Crear Hotel

| Caso | Descripción                                  | Entradas                              | Resultado Esperado                                |
|------|----------------------------------------------|----------------------------------------|---------------------------------------------------|
| TC1  | Crear hotel con nombre y dirección válidos   | Nombre: "Hotel Sol", Dirección: "Av. 123"| Hotel creado sin habitaciones                    |
| TC2  | Crear hotel sin nombre                       | Nombre: "", Dirección: "Calle Luna"     | Error: Campo nombre obligatorio                   |
| TC3  | Crear hotel duplicado                        | Nombre: "Hotel Sol", Dirección: "Otra" | Error o advertencia sobre nombre duplicado        |

---

2. Agregar habitación

| Caso | Descripción                                  | Entradas                                                | Resultado Esperado                      |
|------|----------------------------------------------|----------------------------------------------------------|-----------------------------------------|
| TC4  | Agregar habitación válida                    | Hotel: Hotel Sol, Nº: 101, Tipo: Doble, Precio: 80       | Habitación agregada correctamente       |
| TC5  | Habitación sin tipo                          | Hotel: Hotel Sol, Nº: 102, Tipo: "", Precio: 70          | Error: Tipo requerido                   |
| TC6  | Habitación duplicada en el mismo hotel       | Hotel: Hotel Sol, Nº: 101, Tipo: Suite, Precio: 150      | Error o advertencia                     |

---

3. Ver habitaciones disponibles

| Caso | Descripción                                  | Entradas                            | Resultado Esperado                        |
|------|----------------------------------------------|--------------------------------------|-------------------------------------------|
| TC7  | Ver todas las habitaciones disponibles       | Ninguna                              | Lista de todas las habitaciones libres    |
| TC8  | Filtrar por hotel                            | Hotel: Hotel Sol                     | Solo habitaciones disponibles del hotel   |
| TC9  | Filtrar por fechas                           | Fechas: 01/06 al 03/06               | Habitaciones no reservadas en esas fechas|

---

4. Hacer reserva

| Caso | Descripción                                  | Entradas                                               | Resultado Esperado                               |
|------|----------------------------------------------|--------------------------------------------------------|--------------------------------------------------|
| TC10 | Reserva válida                               | Cliente: Luis, Habitación: 101, Entrada: 01/06, Salida: 05/06 | Reserva confirmada, número generado         |
| TC11 | Reserva con solapamiento                     | Mismo cliente u otro, misma habitación y fechas        | Error: Habitación ya reservada                  |
| TC12 | Fechas inválidas                             | Entrada: 10/06, Salida: 05/06                          | Error: Rango de fechas no válido                |

---

5. Cancelar reserva

| Caso | Descripción                                  | Entradas                              | Resultado Esperado                            |
|------|----------------------------------------------|----------------------------------------|------------------------------------------------|
| TC13 | Cancelar reserva existente                   | Nº Reserva: 12345                      | Reserva cancelada, habitación disponible       |
| TC14 | Cancelar con datos incompletos               | Cliente: Juan                          | Error o solicitud de más información           |
| TC15 | Cancelar reserva ya cancelada                | Nº Reserva: 12345                      | Mensaje: Reserva ya fue cancelada             |

---

6. Ver reservas

| Caso | Descripción                                  | Entradas                                 | Resultado Esperado                     |
|------|----------------------------------------------|-------------------------------------------|----------------------------------------|
| TC16 | Ver todas las reservas                       | Ninguna                                   | Lista completa de reservas activas     |
| TC17 | Filtrar por cliente                          | Cliente: Luis                              | Solo reservas del cliente              |
| TC18 | Filtro por fechas                            | Fechas: 01/06 al 10/06                     | Reservas dentro del rango              |

---

7. Cambiar estado de habitación

| Caso | Descripción                                  | Entradas                         | Resultado Esperado                          |
|------|----------------------------------------------|-----------------------------------|---------------------------------------------|
| TC19 | Estado válido: disponible -> ocupada         | Habitación: 101, Estado: ocupada | Estado actualizado correctamente            |
| TC20 | Estado inválido                              | Habitación: 101, Estado: “cerrada” | Error: Estado no reconocido                |
| TC21 | Sin habitación seleccionada                  | Estado: disponible               | Error: Seleccionar habitación primero       |

---

8. Registrar hotel en el sistema

| Caso | Descripción                                  | Entradas                                     | Resultado Esperado                        |
|------|----------------------------------------------|-----------------------------------------------|-------------------------------------------|
| TC22 | Registro correcto con habitaciones           | Hotel: Hotel Sol, Habitaciones: 3 agregadas   | Hotel registrado para reservas            |
| TC23 | Registro sin habitaciones                    | Hotel: Hotel Mar, Habitaciones: 0             | Error: No se puede registrar sin habitaciones |
| TC24 | Registro de hotel ya registrado              | Hotel: Hotel Sol                              | Error: Hotel ya registrado anteriormente   |

---


