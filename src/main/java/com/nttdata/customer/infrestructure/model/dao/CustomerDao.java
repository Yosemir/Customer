package com.nttdata.customer.infrestructure.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document("customer")
@NoArgsConstructor
public class CustomerDao {

    @Id
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
