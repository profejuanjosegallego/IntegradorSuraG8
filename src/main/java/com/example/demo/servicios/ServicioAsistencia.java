package com.example.demo.servicios;


import com.example.demo.modelos.Asistencia;
import com.example.demo.repositorios.IRepositorioAsistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAsistencia {

    @Autowired
    private IRepositorioAsistencia repository;

    public Asistencia crear(Asistencia asistencia) {

        if (asistencia.getNombrePersona() == null || asistencia.getNombrePersona().isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        repository.save(asistencia);

        return asistencia;
    }

    public List<Asistencia> obtenerTodas() {
        return repository.findAll();
    }

    public Asistencia obtenerPorId(Integer id) {
        Asistencia a = repository.getById(id);
        if (a == null) {
            throw new RuntimeException("Asistencia no encontrada");
        }
        return a;
    }
}
