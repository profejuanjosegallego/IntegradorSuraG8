package com.example.demo.repositorios;
import com.example.demo.modelos.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer> {

    @Procedure(name = "Asistencia.crear")
    void crearAsistencia(
            @Param("nombre") String nombre,
            @Param("fecha") LocalDate fecha,
            @Param("hora") LocalTime hora,
            @Param("asistio") Boolean asistio
    );

    @Procedure(name = "Asistencia.listar")
    List<Asistencia> listarAsistencias();

    @Procedure(name = "Asistencia.buscarPorId")
    Asistencia buscarPorId(@Param("pid") Integer id);
}
