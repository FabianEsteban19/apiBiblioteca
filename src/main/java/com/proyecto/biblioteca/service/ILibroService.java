package com.proyecto.biblioteca.service;


import java.util.List;

import com.proyecto.biblioteca.model.Libro;

public interface ILibroService {
    public List<Libro> listarLibro();
    public Libro obtenerLibro(Integer id);
    public Libro registrarLibro(Libro libro);
    public Libro modificarLibro(Libro libro);
    public String eliminarLibro(Integer id);
}
