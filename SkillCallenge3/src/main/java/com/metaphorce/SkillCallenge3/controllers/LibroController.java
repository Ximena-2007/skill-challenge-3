package com.metaphorce.SkillCallenge3.controllers;

import com.metaphorce.SkillCallenge3.entidades.Libro;
import com.metaphorce.SkillCallenge3.services.LibroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libreria")
public class LibroController {
    @Autowired
    LibroService libroService;


    @GetMapping("/libros")
    public List<Libro> getLibro(){
        return libroService.getLibro();
    }


    @GetMapping("/libros/{id}")
    public Libro getLibroPorId(@PathVariable Integer id){
        return libroService.obtenerPorId(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build()).getBody();
    }

    @PostMapping("/librosGuardar")
    public Libro guardar(@Valid @RequestBody Libro libro) {
        return libroService.guardar(libro);
    }

    @DeleteMapping("/librosEliminar/{id}")
    public void eliminar (@PathVariable Integer id){
        libroService.eliminar(id);
    }
}
