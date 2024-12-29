package com.practicas.reto1;

public class Persona {
  
private String nombre;  
private String numeroCelular;  
private String correoElectronico;  


public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
}

public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
}

public String getNumeroCelular() {
    return numeroCelular;
}

public String getCorreoElectronico() {
    return correoElectronico;
}

public String getNombre() {
    return nombre;
}




public void comprarPaseEstacionamiento(String arg) {
    
    }

    public Persona(String nombre, String numeroCelular, String correoElectronico) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
    }

    
  
}



 