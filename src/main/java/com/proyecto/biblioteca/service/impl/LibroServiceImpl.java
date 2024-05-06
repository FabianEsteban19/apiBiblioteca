package com.proyecto.biblioteca.service.impl;

import com.proyecto.biblioteca.model.Libro;
import com.proyecto.biblioteca.repo.ILibroRepo;
import com.proyecto.biblioteca.service.ILibroService;
import com.proyecto.biblioteca.service.impl.*;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LibroServiceImpl implements ILibroService {
    @Autowired
    private ILibroRepo libroRepo;
    public List<Libro> listarLibro() {
        return libroRepo.findAll();
    }
    public Libro obtenerLibro(Integer id){
        return libroRepo.findById(id).get();
    }
    public Libro registrarLibro(Libro libro) {
        return libroRepo.save(libro);
    }
    public Libro modificarLibro(Libro libro) {
        return libroRepo.save(libro);
    }
    public String eliminarLibro(Integer id){
        libroRepo.deleteById(id);
        return "Libro eliminado";
    }
}
