package com.proyecto.controller;


import com.proyecto.biblioteca.model.Autor;
import com.proyecto.biblioteca.model.Libro;
import com.proyecto.biblioteca.service.impl.IAutorService;
import com.proyecto.biblioteca.service.impl.ILibroService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/autor")
public class AutorController {
    @Autowired
    private IAutorService autorService;

    @GetMapping
    public ResponseEntity<?> listarAutor() {
        List<Autor> autores = autorService.listarAutor();
        return new ResponseEntity<>(autores, autores.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> obtenerAutor(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(autorService.obtenerAutor(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> registrarAutor(@RequestBody Autor autor) {
        Autor newAutor = autorService.registrarAutor(autor);
        return new ResponseEntity<Autor>(newAutor, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarAutor(@RequestBody Autor autor) {
        Autor newAutor = autorService.modificarAutor(autor);
        return new ResponseEntity<Autor>(newAutor, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminarAutor(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(autorService.eliminarAutor(id), HttpStatus.OK);
    }

}
