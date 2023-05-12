package com.kreitek.rrhh.rrhhpersonas;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="RRHH_PERSONA")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    //private String apellidos;

    //public String getApellidos() {
    //    return apellidos;
    //}

    //public void setApellidos(String apellidos) {
    //    this.apellidos = apellidos;
    //}

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date fechaNacimiento;
    //private Integer edad;
    //@Column(length = 10,nullable = true)
    //private String telefono;

    //public String getTelefono() {
    //    return telefono;
    //}
    //
    //public void setTelefono(String telefono) {
    //    this.telefono = telefono;
    //}

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        //edad = calculateAge(fechaNacimiento, Calendar.getInstance().getTime());
        this.fechaNacimiento = fechaNacimiento;
    }

    private Integer calculateAge(Date birthDate, Date currentDate) {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2-d1)/1000;
        return age;
    }



    //public Integer getEdad() {
    //    return edad;
    //}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
