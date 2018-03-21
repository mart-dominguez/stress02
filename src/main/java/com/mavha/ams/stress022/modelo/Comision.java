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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 *
 * @author marti
 */
@Entity
@XmlRootElement 
public class Comision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "ID_CURSO")
    @XmlInverseReference(mappedBy="comisiones")
    private Curso curso;
    @ManyToOne
    @JoinColumn(name = "ID_DOCENTE")
    private Docente docente;
    @ManyToMany
    @JoinTable(name = "COMISION_ALUMNO", joinColumns = @JoinColumn(name = "ID_COMISION"), inverseJoinColumns = @JoinColumn(name = "ID_ALUMNO"))
    private List<Alumno> alumnos;

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

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
