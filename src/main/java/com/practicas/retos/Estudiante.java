package com.practicas.retos;
//

public class Estudiante  extends Persona{
 


private  int numEstudiante;
private double  promedioNotas;
private  String listadoAsignaturas;



    public String getListadoAsignaturas() {
        return listadoAsignaturas;
    }
    public void setListadoAsignaturas(String listadoAsignaturas) {
        this.listadoAsignaturas = listadoAsignaturas;
    }
    public int getNumEstudiante() {
        return numEstudiante;
    }
    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }
    public double  getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double  promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    

    public Estudiante(String nombre, String numeroCelular, String correoElectronico, int numEstudiante, double promedioNotas) {
        super(nombre, numeroCelular, correoElectronico);
        this.numEstudiante = numEstudiante;
        this.promedioNotas = promedioNotas;

    }





}
