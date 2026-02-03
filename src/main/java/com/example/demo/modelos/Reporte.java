package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "Reportes")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double notaFinal;
    private String desempeño;
    private String asistenciaTotal;
    private String promedioCursos;
    private Integer cantidadUsarios;
    private Integer cantidadCursos;
    private String asistenciaCursos;
    private Double promedioNotaCursos;
    private String cursoPopular;
    private String cursoMenosPopular;
    private Integer cantidadUsuariosCurso;
    private Double promedioUsuariosAprobadosCurso;
    private Double promedioMatricula;
    private String calificacionDocente;
    private Double cantidadHorasCurso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getDesempeño() {
        return desempeño;
    }

    public void setDesempeño(String desempeño) {
        this.desempeño = desempeño;
    }

    public String getAsistenciaTotal() {
        return asistenciaTotal;
    }

    public void setAsistenciaTotal(String asistenciaTotal) {
        this.asistenciaTotal = asistenciaTotal;
    }

    public String getPromedioCursos() {
        return promedioCursos;
    }

    public void setPromedioCursos(String promedioCursos) {
        this.promedioCursos = promedioCursos;
    }

    public Integer getCantidadUsarios() {
        return cantidadUsarios;
    }

    public void setCantidadUsarios(Integer cantidadUsarios) {
        this.cantidadUsarios = cantidadUsarios;
    }

    public Integer getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(Integer cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }

    public String getAsistenciaCursos() {
        return asistenciaCursos;
    }

    public void setAsistenciaCursos(String asistenciaCursos) {
        this.asistenciaCursos = asistenciaCursos;
    }

    public Double getPromedioNotaCursos() {
        return promedioNotaCursos;
    }

    public void setPromedioNotaCursos(Double promedioNotaCursos) {
        this.promedioNotaCursos = promedioNotaCursos;
    }

    public String getCursoPopular() {
        return cursoPopular;
    }

    public void setCursoPopular(String cursoPopular) {
        this.cursoPopular = cursoPopular;
    }

    public String getCursoMenosPopular() {
        return cursoMenosPopular;
    }

    public void setCursoMenosPopular(String cursoMenosPopular) {
        this.cursoMenosPopular = cursoMenosPopular;
    }

    public Integer getCantidadUsuariosCurso() {
        return cantidadUsuariosCurso;
    }

    public void setCantidadUsuariosCurso(Integer cantidadUsuariosCurso) {
        this.cantidadUsuariosCurso = cantidadUsuariosCurso;
    }

    public Double getPromedioUsuariosAprobadosCurso() {
        return promedioUsuariosAprobadosCurso;
    }

    public void setPromedioUsuariosAprobadosCurso(Double promedioUsuariosAprobadosCurso) {
        this.promedioUsuariosAprobadosCurso = promedioUsuariosAprobadosCurso;
    }

    public Double getPromedioMatricula() {
        return promedioMatricula;
    }

    public void setPromedioMatricula(Double promedioMatricula) {
        this.promedioMatricula = promedioMatricula;
    }

    public String getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(String calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }

    public Double getCantidadHorasCurso() {
        return cantidadHorasCurso;
    }

    public void setCantidadHorasCurso(Double cantidadHorasCurso) {
        this.cantidadHorasCurso = cantidadHorasCurso;
    }
}