package com.personas.ejemplo001.controlador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "personas", schema = "public")

public class Persona {

    //Agregar las varialbes de la tabla que i¿utilizaremos
    @Id
    @Column
    //Generar
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String apellidos;
    
}
