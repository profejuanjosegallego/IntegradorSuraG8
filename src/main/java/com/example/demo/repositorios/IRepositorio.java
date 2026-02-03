package com.example.demo.repositorios;

import com.example.APISURAG8USUARIOS.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioUsuario extends JpaRepository<Usuario,Integer> {



}
