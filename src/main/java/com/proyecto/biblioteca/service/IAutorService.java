package com.proyecto.biblioteca.service;


import java.util.List;

import com.proyecto.biblioteca.model.Autor;

public interface IAutorService {
    public List<Autor> listarAutor();
    public Autor obtenerAutor(Integer id);
    public Autor registrarAutor(Autor autor);
    public Autor modificarAutor(Autor autor);
    public String eliminarAutor(Integer id);
}
