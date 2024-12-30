package com.practicas.retos;
import java.util.ArrayList;
import java.util.List;


public class RepositorioEstudiante {
    
    private List<Estudiante> estudiantes;

    public void AgregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);

    }

    public RepositorioEstudiante() {
         this.estudiantes = new ArrayList<>();

         estudiantes.add(new Estudiante("Juan", "0934454321", "juan@gmail.com",100, 7.0));
         estudiantes.add(new Estudiante("Joel", "0987645422", "joel@mail.com",101, 6.1));
         estudiantes.add(new Estudiante("Lichi"    , "0546654321", "lichi@gmail.com",102, 8.5));
         estudiantes.add(new Estudiante("Ana", "0923423322", "ana@gmail.com",103, 9.1));
         estudiantes.add(new Estudiante("Alejandro", "0934234321", "alejand@gmail.com",104, 7.7));
         estudiantes.add(new Estudiante("Luis", "0914546322", "luis@gmail.com",105, 9.1));
         estudiantes.add(new Estudiante("Silvio", "0983246562", "silvio@gmail.com",106, 6.5));
         estudiantes.add(new Estudiante("Maritza", "0956938922", "maritza@gmail.com",107, 8.1));
         estudiantes.add(new Estudiante("Robertita", "0987655633", "robertina@gmail.com",108, 5.5));
         estudiantes.add(new Estudiante("Camila", "0934667565", "camilina@gmail.com",109, 9.7));
 
    }

    public List<Estudiante> ObtenerTodosLosEstudiantes (){
      return estudiantes;
    }

 

    
}
