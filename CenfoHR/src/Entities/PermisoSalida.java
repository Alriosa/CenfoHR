/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class PermisoSalida extends Notificacion{
   private boolean estado;
   private Date fechaFin;
   private String descripcion;
   private int id;
   private final String tipoNotificacion="Salida";
   
    public PermisoSalida(boolean estado, Date fechaFin, String descripcion, int id) {
        this.estado = estado;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public PermisoSalida() {
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
   
}
