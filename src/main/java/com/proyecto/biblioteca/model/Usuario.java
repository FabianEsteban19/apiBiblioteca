package com.proyecto.biblioteca.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name="idUsuario")
    private int id;
    @Column(name="correo")
    private String correo;
    @Column(name="contrasena")
    private String contraseña;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Prestamo> prestamos;

}
