package com.proyecto.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="libro")
public class Libro implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="idLibro")
    private int id;

    @Column(name="nomLibro")
    private String nombre;

    @Column(name="descripcionLibro")
    private String descripcion;

    @Column(name="stock")
    private int stock;

    @Column(name="imgPortada")
    private String imagen;


    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;


}