/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.PerfilUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FRANKLIN
 */
@Stateless
public class PerfilUsuarioFacade extends AbstractFacade<PerfilUsuario> implements PerfilUsuarioFacadeLocal {

    @PersistenceContext(unitName = "aeropuertoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PerfilUsuarioFacade() {
        super(PerfilUsuario.class);
    }
    
}
