package com.practicas.reto1;
import java.util.ArrayList;
import java.util.List;


public class RepositorioEstudiante {
    
    private List<Estudiante> estudiantes;

    public void AgregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);

    }

    public RepositorioEstudiante(List<Estudiante> estudiante) {
         this.estudiantes = new ArrayList<>();
         estudiantes.add(new Estudiante("Juan Pérez", "0987654321", "juan@example.com",100, 8.5));
         estudiantes.add(new Estudiante("Ana García", "0987654322", "ana@example.com",101, 9.1));
 //no
    }

    public List<Estudiante> ObtenerTodosLosEstudiantes (){
       return estudiantes;
    }

    public RepositorioEstudiante() {
    }


    
}
