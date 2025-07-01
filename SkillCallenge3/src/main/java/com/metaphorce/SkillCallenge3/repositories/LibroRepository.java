package com.metaphorce.SkillCallenge3.repositories;

import com.metaphorce.SkillCallenge3.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository <Libro,Integer>{
}
