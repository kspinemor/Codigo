/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.actividad;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Profesor {

    private List<Alumno> al;

    public Profesor() {
        al = new ArrayList<>();
    }

    public void AgregarAlumno(Alumno alu) {
        int var = 0;
        for (Alumno al1 : al) {
            if (alu.compareTo(al1)==1) {
                var =1;
            }
        }
        if (var ==1) {
           JOptionPane.showMessageDialog(null,"El alumno ya se encuentra en la lista");
        } else {
            al.add(alu);
            JOptionPane.showMessageDialog(null,"El alumno ha sido agregado");
        }
    }
    public void MostrarAlumnos(){
        int cont =1;
        for (Alumno al1 : al) {
            System.out.println(cont+" "+al1.getIdentificacion());
            cont++;
        }
        
        
    }
}
