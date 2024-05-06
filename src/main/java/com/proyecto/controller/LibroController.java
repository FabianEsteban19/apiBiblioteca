package com.proyecto.controller;

import com.proyecto.biblioteca.model.Libro;
import com.proyecto.biblioteca.service.impl.ILibroService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/libro")
public class LibroController {
    @Autowired
    private ILibroService libroService;

  @GetMapping
  public ResponseEntity<?> listarLibro() {
      List<Libro> libros = libroService.listarLibro();
      return new ResponseEntity<>(libros, libros.size() > 0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
  }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> obtenerLibro(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(libroService.obtenerLibro(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> registrarLibro(@RequestBody Libro libro) {
        Libro newLibros = libroService.registrarLibro(libro);
        return new ResponseEntity<Libro>(newLibros, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarLibro(@RequestBody Libro libro) {
        Libro newLibros = libroService.modificarLibro(libro);
        return new ResponseEntity<Libro>(newLibros, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> eliminarLibro(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(libroService.eliminarLibro(id), HttpStatus.OK);
    }

}
