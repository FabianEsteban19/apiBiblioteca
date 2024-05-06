package com.proyecto.biblioteca.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.biblioteca.model.Autor;

public interface IAutorRepo extends JpaRepository<Autor, Integer> {
}
