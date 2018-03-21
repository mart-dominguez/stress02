/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.stress022.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 *
 * @author marti
 */

@Entity
@XmlRootElement
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @OneToMany(mappedBy = "curso")
    private List<Comision> comisiones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Comision> getComisiones() {
        return comisiones;
    }

    public void setComisiones(List<Comision> comisiones) {
        this.comisiones = comisiones;
    }

    
    
}
