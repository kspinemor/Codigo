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
        al1.setNota1(3.0);
        al1.setNota3(3.0);
        al1.setNota2(3.0);
        System.out.println(al1.getPromedio());
       Alumno al2 = new Alumno();
       Alumno al3 = new Alumno();
       al1.setIdentificacion("97081623485");
       al2.setIdentificacion("97081623485");
       al3.setIdentificacion("97081623484");
       Profesor pro = new Profesor();
       pro.AgregarAlumno(al1);
       pro.AgregarAlumno(al2);
       pro.AgregarAlumno(al3);
       pro.MostrarAlumnos();
        double promedTemp = al1.getPromedio();
        double promTemp=al1.getPromedio()*10 ;
        if (promTemp%10>=5) {
        promedTemp=promedTemp +1;    
        }
        
        double prom;
        double acom;
        double promDouble=0;
        String promed = "";

        do {
 acom = (int) promedTemp % 10;
 promDouble = (promDouble*10)+acom;
        promedTemp = promedTemp / 10;
        } while (promedTemp>=1);
       
  int cont =0;
       

        do {
            prom = (int) promDouble % 10;
             if (cont==1) {
                promed = promed+ " punto";
            }
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
                    promed = promed + " seis";
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
                case  0: 
                    promed = promed + " cero";
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
            cont++;
            promDouble = promDouble / 10;
        } while (promDouble >=0.1);
        System.out.println(promed);

    }

}
