package com.example.demo.servicios;

import com.example.demo.modelos.Notificacion;
import com.example.demo.repositorios.IRepositorioNotificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioNotificacion {

    //EL SERVICIO UTILIZA AL REPOSITORIO
    //A ESTE USO SE LE LLAMA INYECCION DE DEPENDENCIA

    @Autowired
    IRepositorioNotificacion repositorio;

    //se crean funciones publicas para activar cada consulta que se quiera ofrecer

    public Notificacion guardar(Notificacion datos) {
        return this.repositorio.save(datos);
    }

    public List<Notificacion> buscarTodos(){
        return this.repositorio.findAll();
    }

    public Notificacion buscarPorId(Integer id) throws Exception {
        //1. Para buscar por id, 1ero debo utilizar la clase "optional" de Java
        Optional<Notificacion> notificacionBuscado=this.repositorio.findById(id);
        if (notificacionBuscado.isPresent()){
            return notificacionBuscado.get();
        }else {
            throw new Exception("No se encontro el () buscado");
        }
    }
}
