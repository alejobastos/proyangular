/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.ProyectoEquipoApp.controlador;

import edu.co.ProyectoEquipoApp.entidades.Jugador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Mauro Parra
 */
@Stateless
public class JugadorFacade extends AbstractFacade<Jugador> {

    @PersistenceContext(unitName = "ProyectoEquipoAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JugadorFacade() {
        super(Jugador.class);
    }
    
}
