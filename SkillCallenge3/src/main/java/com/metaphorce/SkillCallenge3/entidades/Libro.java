package com.metaphorce.SkillCallenge3.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table (name="libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idLibro;

   @NotBlank(message = "El título no puede estar vacío")
   @Size(min=2,max=100,message = "El titulo debe tener entre 2 y 100 caracteres")
   private String titulo;

   @NotBlank(message ="El autor no puede estar vacío")
   private String autor;

   @NotBlank(message = "La editorial no puede estar vacía")
   private String editorial;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
