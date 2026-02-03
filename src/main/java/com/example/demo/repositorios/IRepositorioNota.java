package com.example.demo.repositorios;

import com.example.APISURAG8NOTAS.modelos.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioNota extends JpaRepository<Nota,Integer> {
}
