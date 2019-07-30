/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author franciscosandoval
 */
public class Notificacion {
    
    private Date fechaNotificacion;
    private String asunto;
    private Boolean estado;
    private String remitente;
   
    public Notificacion() {
    }

    public Notificacion(Date fechaNotificacion, String asunto, Boolean estado, String remitente) {
        this.fechaNotificacion = fechaNotificacion;
        this.asunto = asunto;
        this.estado = estado;
        this.remitente = remitente;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public String toString() {
        return "Notificacion{" + "fechaNotificacion=" + fechaNotificacion + ", asunto=" + asunto + ", estado=" + estado + ", remitente=" + remitente + '}';
    }
     
}
