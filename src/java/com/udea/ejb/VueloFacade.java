/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.Vuelo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FRANKLIN
 */
@Stateless
public class VueloFacade extends AbstractFacade<Vuelo> implements VueloFacadeLocal {

    @PersistenceContext(unitName = "aeropuertoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VueloFacade() {
        super(Vuelo.class);
    }
    
}
