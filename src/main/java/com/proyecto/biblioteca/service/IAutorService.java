package com.proyecto.biblioteca.service;

import com.biblioteca.cibertec.Biblioteca2024.model.Autor;
import com.biblioteca.cibertec.Biblioteca2024.model.Libro;

import java.util.List;

public interface IAutorService {
    public List<Autor> listarAutor();
    public Autor obtenerAutor(Integer id);
    public Autor registrarAutor(Autor autor);
    public Autor modificarAutor(Autor autor);
    public String eliminarAutor(Integer id);
}
