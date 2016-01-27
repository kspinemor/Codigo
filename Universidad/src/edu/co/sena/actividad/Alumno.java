/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.actividad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin
 */
public class Alumno implements Comparable<Alumno>{
    
    private String identificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Alumno() {
        
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio=(this.nota1+this.nota2+this.nota3)/3;
    }
    public String getPromedioLetras() {
        double promedTemp= promedio;
        double prom;
        String promed="wssd";
        do {            
        promedTemp = promedTemp / 10;
        prom= promedTemp;
        
        } while (promedTemp>=1);
        
       return promed;
    }

    @Override
    public int compareTo(Alumno o) {
    int var =0;
        if (getIdentificacion().equals(o.getIdentificacion()) ) {
            var=1;
        }
    return var;
    }
    
}
