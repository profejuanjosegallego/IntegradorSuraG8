package com.example.demo.service;

import com.example.demo.model.Asistencia;
import com.example.demo.repository.AsistenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaService {

    private final AsistenciaRepository repository;

    public AsistenciaService(AsistenciaRepository repository) {
        this.repository = repository;
    }

    public Asistencia crear(Asistencia asistencia) {

        if (asistencia.getNombrePersona() == null || asistencia.getNombrePersona().isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }

        repository.crearAsistencia(
                asistencia.getNombrePersona(),
                asistencia.getFecha(),
                asistencia.getHoraEntrada(),
                asistencia.getAsistio()
        );

        return asistencia;
    }

    public List<Asistencia> obtenerTodas() {
        return repository.listarAsistencias();
    }

    public Asistencia obtenerPorId(Integer id) {
        Asistencia a = repository.buscarPorId(id);
        if (a == null) {
            throw new RuntimeException("Asistencia no encontrada");
        }
        return a;
    }
}
