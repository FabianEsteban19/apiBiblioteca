package com.proyecto.biblioteca.service.impl;

import com.proyecto.biblioteca.model.Autor;
import com.proyecto.biblioteca.model.Libro;
import com.proyecto.biblioteca.repo.IAutorRepo;
import com.proyecto.biblioteca.service.impl.IAutorService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AutorServiceImpl implements IAutorService {
    @Autowired
    private IAutorRepo autorRepo;
    public List<Autor> listarAutor(){
        return autorRepo.findAll();
    }
    public Autor obtenerAutor(Integer id){
        return autorRepo.findById(id).get();
    }
    public Autor registrarAutor(Autor autor) {
        return autorRepo.save(autor);
    }
    public Autor modificarAutor(Autor autor){
        return  autorRepo.save(autor);
    }
    public String eliminarAutor(Integer id){
        autorRepo.deleteById(id);
        return "Autor eliminado";
    }

}
