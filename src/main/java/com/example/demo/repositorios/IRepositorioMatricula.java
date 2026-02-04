package com.example.demo.repositorios;


import com.example.demo.modelos.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioMatricula extends JpaRepository<Matricula, Integer> {
}