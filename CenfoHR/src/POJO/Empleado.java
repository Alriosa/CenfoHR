/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.util.Date;

/**
 *
 * @author Alriosa
 */
public class Empleado {
    private String nombre;
    private String apellidoUno;
    private String apellidoDos;
    private Date fechaDeNacimiento;
    private String genero;
    private int numeroDeCedula;
    private int gradoAcademico;
    //Fotografia del empleado, JPG o PNG
    //Agregar CV PDF
    //Hoja de revision XLS
    private String datosDeEmergencia;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidoUno, String apellidoDos, Date fechaDeNacimiento, String genero, int numeroDeCedula, int gradoAcademico, String datosDeEmergencia) {
        this.nombre = nombre;
        this.apellidoUno = apellidoUno;
        this.apellidoDos = apellidoDos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.genero = genero;
        this.numeroDeCedula = numeroDeCedula;
        this.gradoAcademico = gradoAcademico;
        this.datosDeEmergencia = datosDeEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoUno() {
        return apellidoUno;
    }

    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }

    public String getApellidoDos() {
        return apellidoDos;
    }

    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroDeCedula() {
        return numeroDeCedula;
    }

    public void setNumeroDeCedula(int numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    public int getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(int gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getDatosDeEmergencia() {
        return datosDeEmergencia;
    }

    public void setDatosDeEmergencia(String datosDeEmergencia) {
        this.datosDeEmergencia = datosDeEmergencia;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidoUno=" + apellidoUno + ", apellidoDos=" + apellidoDos + ", fechaDeNacimiento=" + fechaDeNacimiento + ", genero=" + genero + ", numeroDeCedula=" + numeroDeCedula + ", gradoAcademico=" + gradoAcademico + ", datosDeEmergencia=" + datosDeEmergencia + '}';
    }
    
    
}
