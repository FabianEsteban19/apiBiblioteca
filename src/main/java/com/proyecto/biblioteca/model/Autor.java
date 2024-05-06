package com.proyecto.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="autor")
public class Autor {

    @Id
    @GeneratedValue
    @Column(name="idAutor")
    private int id;
    @Column(name="nomAutor")
    private String nombre;
    @Column(name="apeAutor")
    private String apellido;
    @Column(name="paisAutor")
    private String pais;
    @Column(name="naciAutor")
    private LocalDate nacimiento;

    @JsonIgnore

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Libro> libros = new ArrayList<>();

}