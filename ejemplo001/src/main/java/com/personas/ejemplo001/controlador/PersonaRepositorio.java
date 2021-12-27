/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.personas.ejemplo001.controlador;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernando.flores
 */
@Repository
public interface PersonaRepositorio extends JpaRepository<Persona, Long>,
        JpaSpecificationExecutor<Persona>{
}
//
//extends Repository<Persona, Integer>{
//    List<Persona>findAll();
//    Persona findOne(int id);
//    Persona save(Persona p);
//    void delete(Persona p)
//
