package com.proyecto.biblioteca.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.biblioteca.model.Libro;

public interface ILibroRepo extends JpaRepository<Libro, Integer> {
}
