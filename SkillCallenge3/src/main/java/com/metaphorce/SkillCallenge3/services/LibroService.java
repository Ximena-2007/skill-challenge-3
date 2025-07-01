package com.metaphorce.SkillCallenge3.services;

import com.metaphorce.SkillCallenge3.entidades.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService {
   List<Libro> getLibro();
    Optional<Libro> obtenerPorId(Integer id);
    Libro guardar (Libro libro);
    void eliminar (Integer id);
}
