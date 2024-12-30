package com.practicas.retos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.retos.Estudiante;
import com.practicas.retos.RepositorioEstudiante;
import com.practicas.retos.ServiceEstudiante;

@RestController
@RequestMapping("api/estudiantes")
public class EstudianteController {
    
    private   ServiceEstudiante service;
 

 

    public EstudianteController() {
        RepositorioEstudiante  repo = new RepositorioEstudiante();
        service = new ServiceEstudiante(repo);
    }

  
    
    
    @GetMapping("/listartodos")
     public  List<Estudiante> ListarTodos(){
 
        return service.ListarTodoslosEstudiantes();
     }


     @GetMapping("/filtrar/nombre/{nombre}")
     public List<Estudiante> FiltrarPorNombre(@PathVariable String nombre) {
        return service.FiltrarPorNombre(nombre);
     }
 
     @GetMapping("/filtrar/numerocelular/{numeroCelular}")
     public List<Estudiante> FiltrarPorNumeroCelular(@PathVariable String numeroCelular) {
         return service.FiltrarporNumeroCelular(numeroCelular);
     }
 
     @GetMapping("/ordenar/promedioNotas")
     public List<Estudiante> OrdenarPorPromedioNotas() {
         return service.OrdenarPorPromediodeNotas();
     }
 



}

 