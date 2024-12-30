package com.practicas.retos;

import java.util.List;
import java.util.stream.Collectors;


public class ServiceEstudiante {
    
    private RepositorioEstudiante repoEstudiante;
 
    /*Liste todos los estudiantes.
Filtre los estudiantes por el atributo nombre
Filtre los estudiantes por el atributo numeroCelular
Ordene los estudiantes por el atributo promedioNotas
*/
 


public List<Estudiante> ListarTodoslosEstudiantes() {
    return repoEstudiante.ObtenerTodosLosEstudiantes();
    
}
public ServiceEstudiante(RepositorioEstudiante repoEstudiante) {
    
    this.repoEstudiante = repoEstudiante;
}


public List<Estudiante>  FiltrarPorNombre(String nombre) {
    return repoEstudiante.ObtenerTodosLosEstudiantes().stream()
          .filter(e-> e.getNombre().equalsIgnoreCase(nombre))
          .collect(Collectors.toList());
}


public List<Estudiante> FiltrarporNumeroCelular(String numero) {
    return repoEstudiante.ObtenerTodosLosEstudiantes().stream()
    .filter(e-> e.getNumeroCelular().equalsIgnoreCase(numero))
    .collect(Collectors.toList());

}
 
public List<Estudiante> OrdenarPorPromediodeNotas(){
    return  repoEstudiante.ObtenerTodosLosEstudiantes().stream()
    .sorted((e1, e2) -> Double.compare(e1.getPromedioNotas(), e2.getPromedioNotas()))
    .collect(Collectors.toList());
}



}
