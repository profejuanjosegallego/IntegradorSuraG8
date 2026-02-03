package com.example.demo.modelos;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "asistencia")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "Asistencia.crear",
                procedureName = "crear_asistencia",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "nombre", type = String.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "fecha", type = LocalDate.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "hora", type = LocalTime.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "asistio", type = Boolean.class)
                }
        ),
        @NamedStoredProcedureQuery(
                name = "Asistencia.listar",
                procedureName = "listar_asistencias",
                resultClasses = Asistencia.class
        ),
        @NamedStoredProcedureQuery(
                name = "Asistencia.buscarPorId",
                procedureName = "buscar_asistencia_por_id",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "pid", type = Integer.class)
                },
                resultClasses = Asistencia.class
        )
})
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombrePersona;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime horaEntrada;

    @Column(nullable = false)
    private Boolean asistio;

    // 🔹 CONSTRUCTOR VACÍO (OBLIGATORIO JPA)
    public Asistencia() {
    }

    // 🔹 GETTERS Y SETTERS (OBLIGATORIOS)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }
}

