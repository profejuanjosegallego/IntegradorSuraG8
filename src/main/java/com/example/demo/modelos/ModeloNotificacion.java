package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="notificaciones")

public class ModeloNotificacion {

    @Id  //todas las anotaciones van encima de lo que quiero resaltar
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Boolean MensajeLeido;
    private Boolean MensajeEliminado;
    private Number ArchivosAdjuntos;
    private String HoraEnvio;
    private Number ContadorNotificaciones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMensajeLeido() {
        return MensajeLeido;
    }

    public void setMensajeLeido(Boolean mensajeLeido) {
        MensajeLeido = mensajeLeido;
    }

    public Boolean getMensajeEliminado() {
        return MensajeEliminado;
    }

    public void setMensajeEliminado(Boolean mensajeEliminado) {
        MensajeEliminado = mensajeEliminado;
    }

    public Number getArchivosAdjuntos() {
        return ArchivosAdjuntos;
    }

    public void setArchivosAdjuntos(Number archivosAdjuntos) {
        ArchivosAdjuntos = archivosAdjuntos;
    }

    public String getHoraEnvio() {
        return HoraEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        HoraEnvio = horaEnvio;
    }

    public Number getContadorNotificaciones() {
        return ContadorNotificaciones;
    }

    public void setContadorNotificaciones(Number contadorNotificaciones) {
        ContadorNotificaciones = contadorNotificaciones;
    }
}
