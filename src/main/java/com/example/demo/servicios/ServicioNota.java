package com.example.demo.servicios;



import com.example.demo.modelos.Nota;
import com.example.demo.repositorios.IRepositorioNota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioNota {

    //El servicio utiliza al repositorio
    //A este uso se le llama, "inyección de dependencia"

    @Autowired
    IRepositorioNota repositorio;

    //Se crean funciones publicas para activar cada consulta
    //que se quiera ofrecer

    public Nota guardar (Nota datos){
        return this.repositorio.save(datos);
    }

    public List<Nota> buscarTodos(){
        return this.repositorio.findAll();
    }

    public Nota buscarPorId(Integer id)throws Exception{
        //1. Para buscar por Id, primero debo utilizar la clase optional de Java
        Optional<Nota> notaBuscada = this.repositorio.findById(id);
        if (notaBuscada.isPresent()){
            return notaBuscada.get();
        } else {
            throw new Exception("No se encontro la nota buscada");
        }
    }
}
