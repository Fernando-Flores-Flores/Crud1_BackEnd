/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personas.ejemplo001.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*",maxAge=3600)
@RestController
@RequestMapping("/personas")
public class Controlador {
    @Autowired
    PersonaService service;
    
    @GetMapping(path="/lista")
    public List<Persona>listar(){
        return service.listar();
    }
 
}
