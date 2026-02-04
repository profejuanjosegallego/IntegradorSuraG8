package com.example.demo.repositorios;


import com.example.demo.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioUsuario extends JpaRepository<Usuario,Integer> {



}

