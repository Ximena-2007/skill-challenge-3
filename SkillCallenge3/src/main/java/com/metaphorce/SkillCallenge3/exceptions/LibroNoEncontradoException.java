package com.metaphorce.SkillCallenge3.exceptions;

public class LibroNoEncontradoException extends RuntimeException{
    public LibroNoEncontradoException(Integer id){
        super("Libro con ID"+ id + "no encontrado");
    }
}
