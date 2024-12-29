package com.practicas.reto1;


public class Profesor extends Persona {
    
    private double salario;


    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public Profesor(String nombre, String numeroCelular, String correoElectronico, double salario   ) {
        super(nombre, numeroCelular, correoElectronico);
        this.salario = salario;

    }

 
    
}
