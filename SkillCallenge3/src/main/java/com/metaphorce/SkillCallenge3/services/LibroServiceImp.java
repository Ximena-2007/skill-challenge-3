package com.metaphorce.SkillCallenge3.services;

import com.metaphorce.SkillCallenge3.entidades.Libro;
import com.metaphorce.SkillCallenge3.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServiceImp implements LibroService{
    @Autowired
    LibroRepository libroRepository;
    @Override
    public List<Libro> getLibro() {
        return libroRepository.findAll();
    }

    public Optional<Libro> obtenerPorId(Integer id){
        return libroRepository.findById(id);
    }

    public Libro guardar (Libro libro){
        return libroRepository.save(libro);
    }

    public void eliminar (Integer id){
        libroRepository.deleteById(id);
    }
}
