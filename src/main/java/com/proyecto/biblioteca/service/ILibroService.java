package com.proyecto.biblioteca.service;

import com.biblioteca.cibertec.Biblioteca2024.model.Libro;

import java.util.List;

public interface ILibroService {
    public List<Libro> listarLibro();
    public Libro obtenerLibro(Integer id);
    public Libro registrarLibro(Libro libro);
    public Libro modificarLibro(Libro libro);
    public String eliminarLibro(Integer id);
}
