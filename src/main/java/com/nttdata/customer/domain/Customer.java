package com.nttdata.customer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Customer {


    private Long id;
    private String dni;         // DNI del usuario
    private String firstName;   // Nombres
    private String lastName;    // Apellidos
    private String phone;       // Celular
    private String address;     // Direccion
    private String email;       // Correo electronico
    private String role;        //
    private LocalDate date;     // fecha de registro
}
