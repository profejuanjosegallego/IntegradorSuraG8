package com.example.demo.repositorios;

import com.example.demo.modelos.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioCurso extends JpaRepository<Curso, Integer> {
}
