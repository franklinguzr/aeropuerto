/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.EstadoPasajero;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FRANKLIN
 */
@Stateless
public class EstadoPasajeroFacade extends AbstractFacade<EstadoPasajero> implements EstadoPasajeroFacadeLocal {

    @PersistenceContext(unitName = "aeropuertoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoPasajeroFacade() {
        super(EstadoPasajero.class);
    }
    
}
