/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.stress022;

import com.mavha.ams.stress022.modelo.Alumno;
import com.mavha.ams.stress022.modelo.Comision;
import com.mavha.ams.stress022.modelo.Curso;
import com.mavha.ams.stress022.modelo.Docente;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author marti
 */
@Path("curso")
@Stateless
public class CursoResource {

    @Context
    private UriInfo context;

    @PersistenceContext(unitName = "StressPU")
    private EntityManager em;

    /**
     * Creates a new instance of Dato1Resource
     */
    public CursoResource() {
    }

    /**
     * Retrieves representation of an instance of
     * com.mavha.ams.stress022.CursoResource
     *
     * @return an instance of java.lang.String
     *
     * @GET
     * @Produces(MediaType.APPLICATION_XML) public Curso getCurso() { Curso c1 =
     * new Curso();
     *
     * try { c1.setNombre("CURSO-" + UUID.randomUUID());
     *
     * Docente d1 = new Docente(); d1.setNombre("DOC-" + UUID.randomUUID());
     * Docente d2 = new Docente(); d2.setNombre("DOC-" + UUID.randomUUID());
     *
     * Alumno a1 = new Alumno(); a1.setNombre("ALU-" + UUID.randomUUID());
     * Alumno a2 = new Alumno(); a2.setNombre("ALU-" + UUID.randomUUID());
     * Alumno a3 = new Alumno(); a3.setNombre("ALU-" + UUID.randomUUID());
     * Alumno a4 = new Alumno(); a4.setNombre("ALU-" + UUID.randomUUID());
     *
     * Comision com1 = new Comision(); Comision com2 = new Comision();
     * com1.setNombre("COMIS-" + UUID.randomUUID()); com2.setNombre("COMIS-" +
     * UUID.randomUUID()); com1.setCurso(c1); com2.setCurso(c1);
     * com1.setAlumnos(new ArrayList<Alumno>()); com2.setAlumnos(new
     * ArrayList<Alumno>()); com1.getAlumnos().add(a1);
     * com1.getAlumnos().add(a3); com2.getAlumnos().add(a2);
     * com2.getAlumnos().add(a4); com1.setDocente(d2); com2.setDocente(d1);
     *
     * em.persist(a1); em.persist(a2); em.persist(a3); em.persist(a4);
     *
     * em.persist(d1); em.persist(d2);
     *
     * em.persist(com1); em.persist(com2); c1.setComisiones(new
     * ArrayList<Comision>()); c1.getComisiones().add(com1);
     * c1.getComisiones().add(com2); em.persist(c1);
     * System.out.println("LISTOOOOOOO"); return c1; } catch (Exception e) {
     * e.printStackTrace(); }
     *
     * //TODO return proper representation object return null;
    }
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comision> getCursos() {
        List<Comision> lista = em.createQuery("SELECT c FROM Comision c").getResultList();
        System.out.println("TAMANIOOOO " + lista.size());
        return lista;

    }

    /**
     * PUT method for updating or creating an instance of CursoResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
