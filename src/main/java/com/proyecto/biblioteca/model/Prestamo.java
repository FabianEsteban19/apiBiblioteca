package com.proyecto.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="prestamo")
public class Prestamo {
    @Id
    @GeneratedValue
    @Column(name="idPrestamo")
    private int id;
    @Column(name="fechaPrestamo")
    private LocalDate fecPrestamo;
    @Column(name="fechaDevolucion")
    private LocalDate fecDevolucion;
    @Column(name="estadoPrestamo")
    private String esPrestamo;


    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;
}
