/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.actividad;

/**
 *
 * @author kevin
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno al1 = new Alumno();
        al1.setNota1(25.4);
        al1.setNota3(25.4);
        al1.setNota2(25.4);
//        System.out.println(al1.getPromedio());
//       Alumno al2 = new Alumno();
//       Alumno al3 = new Alumno();
//       al1.setIdentificacion("97081623485");
//       al2.setIdentificacion("97081623485");
//       al3.setIdentificacion("97081623484");
//       Profesor pro = new Profesor();
//       pro.AgregarAlumno(al1);
//       pro.AgregarAlumno(al2);
//       pro.AgregarAlumno(al3);
//       pro.MostrarAlumnos();
        double promedTemp =(int) 10*al1.getPromedio();
        double prom;
        double promDouble;
        String promed="";
        do {
            prom = (int) promedTemp %10;
            
            
//            prom =  promedTemp;
            switch ((int) prom) {
                case 1:
                    promed = promed + " uno";
                    break;
                case 2:
                    promed = promed + " dos";
                    break;
                case 3: 
                    promed = promed + " tres";
                    break;
                case 4: 
                    promed = promed + " cuatro";
                    break;
                case 5: 
                    promed = promed + " cinco";
                    break;
                case 6: 
                    promed = promed + " seid";
                    break;
                case 7: 
                    promed = promed + " siete";
                    break;
                case 8: 
                    promed = promed + " ocho";
                    break;
                case 9: 
                    promed = promed + " nueve";
                    break;
                default: 
                    System.out.println("Error");
                    break;
            }
            promedTemp = promedTemp / 10;
        } while (promedTemp >= 1);
        System.out.println(promed);

    }

}
