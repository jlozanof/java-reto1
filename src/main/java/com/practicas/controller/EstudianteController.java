package com.practicas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.reto1.Estudiante;
import com.practicas.reto1.ServiceEstudiante;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
    
    private final ServiceEstudiante service;

    public EstudianteController(ServiceEstudiante service) {
        this.service = service;
    }
    @GetMapping("/listartodos")
     public  List<Estudiante> ListarTodos(){
        return service.ListarTodoslosEstudiantes();
     }


    @GetMapping("/filtrar/nombre")
    public List<Estudiante> FiltrarPorNombre(@RequestParam String nombre) {
        return service.FiltrarPorNombre(nombre);
    }

    @GetMapping("/filtrar/numerocelular")
    public List<Estudiante> FiltrarPorNumeroCelular(@RequestParam String numeroCelular) {
        return service.FiltrarporNumeroCelular(numeroCelular);
    }

    @GetMapping("/ordenar/promedionotas")
    public List<Estudiante> OrdenarPorPromedioNotas() {
        return service.OrdenarPorPromediodeNotas();
    }




}

 