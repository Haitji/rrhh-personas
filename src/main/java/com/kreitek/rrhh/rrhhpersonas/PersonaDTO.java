package com.kreitek.rrhh.rrhhpersonas;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PersonaDTO {
    private Integer id;
    private String nombre;
    private Date fechaNacimiento;

    //private String apellidos;
    //
    //public String getApellidos() {
    //    return apellidos;
    //}

    //public void setApellidos(String apellidos) {
    //    this.apellidos = apellidos;
    //}

    //private Integer edad;
    //@JsonFormat(pattern = "dd-MM-yyyy")

    //public Integer getEdad() {
    //    return edad;
    //}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //public void setEdad(Integer edad) {
    //    this.edad = edad;
    //}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



}
