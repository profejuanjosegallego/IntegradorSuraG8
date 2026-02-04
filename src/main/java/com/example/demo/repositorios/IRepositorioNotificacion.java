package com.example.demo.repositorios;


import com.example.demo.modelos.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositorioNotificacion extends JpaRepository <Notificacion,Integer> {


}
